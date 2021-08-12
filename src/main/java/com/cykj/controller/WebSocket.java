package com.cykj.controller;

import com.cykj.bean.MsgInfo;
import com.cykj.bean.SessionList;
import com.cykj.bean.User;
import com.cykj.mapper.UserMapper2;
import com.cykj.service.impl.MsgInfoServiceImpl;
import com.cykj.service.impl.SessionListServiceImpl;
import com.cykj.utils.CurPool;
import com.cykj.utils.SpringUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 13:03
 * @desc:
 */
@Component
@ServerEndpoint("/websocket/{userId}/{sessionId}")
public class WebSocket {
    private Gson gson = new Gson();
    @Autowired
    private SessionListServiceImpl sessionListMapper;

    @Autowired
    private UserMapper2 userMapper;

    @Autowired
    private MsgInfoServiceImpl msgInfoMapper;

    private Session session;

    @OnOpen
    public void onOpen(Session session, @PathParam(value = "userId") Integer userId, @PathParam(value = "sessionId") String sessionId) {
        this.session = session;
        CurPool.webSockets.put(userId, this);
        List<Object> list = new ArrayList<>();
        list.add(sessionId);
        list.add(session);
        CurPool.sessionPool.put(userId, list);
        System.out.println("【websocket消息】有新的连接，总数为:" + CurPool.webSockets.size());
    }

    @OnClose
    public void onClose() {
        // 断开连接删除用户删除session
        Integer userId = Integer.parseInt(this.session.getRequestParameterMap().get("userId").get(0));
        System.out.println("断开连接删除用户删除session:" + userId);
        CurPool.sessionPool.remove(userId);
        CurPool.webSockets.remove(userId);
//        if (userMapper == null) {
//            this.userMapper = new UserServiceImpl();
//        }
//        System.out.println("13:" + userMapper);
//        User user = userMapper.selectByPrimaryKey(userId);
//        System.out.println("断开连接删除用户删除session:" + user);
        CurPool.curUserPool.remove(userId);
        System.out.println("【websocket消息】连接断开，总数为:" + CurPool.webSockets.size());
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println("【websocket消息】收到客户端消息:" + message);
        String sessionId = this.session.getRequestParameterMap().get("sessionId").get(0);
        if (sessionId == null) {
            System.out.println("sessionId 错误");
        }
//         在这里无法注入Mapper所以使用这种方式注入Mapper
        if (sessionListMapper == null) {
            this.sessionListMapper = (SessionListServiceImpl) SpringUtil.getBean("sessionListServiceImpl");
        }
        if (userMapper == null) {
            this.userMapper = (UserMapper2) SpringUtil.getBean("userMapper2");
        }
        if (msgInfoMapper == null) {
            this.msgInfoMapper = (MsgInfoServiceImpl) SpringUtil.getBean("msgInfoServiceImpl");
        }
        System.out.println(userMapper + " " + sessionListMapper + " " + msgInfoMapper);
        SessionList sessionList = sessionListMapper.selectByPrimaryKey(Integer.parseInt(sessionId));
        User user = userMapper.selectByPrimaryKey(sessionList.getUserId());
        MsgInfo msgInfo = new MsgInfo();
        msgInfo.setContent(message);
        msgInfo.setCreateTime(new Date());
        msgInfo.setFromUserId(sessionList.getUserId());
        msgInfo.setFromUserName(user.getUname());
        msgInfo.setToUserId(sessionList.getToUserId());
        msgInfo.setToUserName(sessionList.getListName());
        msgInfo.setUnReadFlag(0);
        // 消息持久化
        msgInfoMapper.insert(msgInfo);

        // 判断用户是否存在，不存在就结束
        List<Object> list = CurPool.sessionPool.get(sessionList.getToUserId());
        if (list == null || list.isEmpty()) {
            // 用户不存在，更新未读数
            sessionListMapper.addUnReadCount(sessionList.getToUserId(), sessionList.getUserId());
        } else {
            // 用户存在，判断会话是否存在
            String id = sessionListMapper.selectIdByUser(sessionList.getToUserId(), sessionList.getUserId()) + "";
            String o = list.get(0) + "";
            if (id.equals(o)) {
                // 会话存在直接发送消息
                sendTextMessage(sessionList.getToUserId(), gson.toJson(msgInfo));
            } else {
                // 判断会话列表是否存在
                if (id == null || "".equals(id) || "null".equals(id)) {
                    // 新增会话列表
                    SessionList tmpSessionList = new SessionList();
                    tmpSessionList.setUserId(sessionList.getToUserId());
                    tmpSessionList.setToUserId(sessionList.getUserId());
                    tmpSessionList.setListName(user.getUname());
                    tmpSessionList.setUnReadCount(1);
                    sessionListMapper.insert(tmpSessionList);
                } else {
                    // 更新未读消息数量
                    sessionListMapper.addUnReadCount(sessionList.getToUserId(), sessionList.getUserId());
                }
                // 会话不存在发送列表消息
                List<SessionList> sessionLists = sessionListMapper.selectByUserId(sessionList.getToUserId());
                sendTextMessage(sessionList.getToUserId(), gson.toJson(sessionLists));
            }
        }
    }

    // 此为广播消息
//    public void sendAllMessage(String message) {
//        for(WebSocket webSocket : webSockets) {
//            System.out.println("【websocket消息】广播消息:"+message);
//            try {
//                webSocket.session.getAsyncRemote().sendText(message);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }

    // 此为单点消息 (发送文本)
    public void sendTextMessage(Integer userId, String message) {
        Session session = (Session) CurPool.sessionPool.get(userId).get(1);
        if (session != null) {
            try {
                session.getBasicRemote().sendText(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // 此为单点消息 (发送对象)
//    public void sendObjMessage(String sessionId, Object message) {
//        Session session = CurPool.sessionPool.get(sessionId);
//        if (session != null) {
//            try {
////                session.getAsyncRemote().sendObject(message);
//                session.getBasicRemote().sendText(JsonUtils.objectToJson(message));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
