package com.cykj.controller;

import com.cykj.bean.MsgInfo;
import com.cykj.bean.SessionList;
import com.cykj.service.impl.MsgInfoServiceImpl;
import com.cykj.service.impl.SessionListServiceImpl;
import com.cykj.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 13:54
 * @desc:
 */
@RestController
public class MsgInfoController {
    @Autowired
    private MsgInfoServiceImpl msgInfoMapper;

    @Autowired
    private SessionListServiceImpl seesionListMapper;

    // 消息列表
    @GetMapping("/msgList")
    public AjaxResult<?> msgList(@RequestParam Integer sessionId){
        SessionList sessionList = seesionListMapper.selectByPrimaryKey(sessionId);
        if(sessionList == null){
            return AjaxResult.success();
        }
        Integer fromUserId = sessionList.getUserId();
        Integer toUserId = sessionList.getToUserId();
        List<MsgInfo> msgInfoList = msgInfoMapper.selectMsgList(fromUserId,toUserId);
        // 更新消息已读
        msgInfoMapper.msgRead(fromUserId, toUserId);
        // 更新会话里面的未读消息
        seesionListMapper.delUnReadCount(fromUserId, toUserId);
        return AjaxResult.success(msgInfoList);
    }
}
