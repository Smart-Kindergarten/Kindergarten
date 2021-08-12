package com.cykj.controller;

import com.cykj.bean.SessionList;
import com.cykj.bean.User;
import com.cykj.mapper.UserMapper2;
import com.cykj.service.impl.SessionListServiceImpl;
import com.cykj.service.impl.UserServiceImpl;
import com.cykj.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 17:19
 * @desc:
 */
@RestController
public class SessionController {
    @Autowired
    private UserMapper2 userMapper;

    @Autowired
    private SessionListServiceImpl sessionListService;

    /**
     * 已建立会话
     */
    @GetMapping("/sessionList/already")
    public AjaxResult<?> sessionListAlready(@RequestParam Integer id) {
        System.out.println("----已建立会话----");
        List<SessionList> sessionLists = sessionListService.selectByUserId(id);
        return AjaxResult.success(sessionLists);
    }

    // 可建立会话的用户
    @RequestMapping("/sessionList/not")
    public AjaxResult<?> sessionListNot(Integer id, int classId) {
        System.out.println("---可建立会话的用户---");
        List<Integer> list = sessionListService.selectUserIdByUserId(id);
        System.out.println("---可建立会话的用户---" + list);
        list.add(id);
        List<User> cloudList = userMapper.getCloudList(list, classId);
        System.out.println("---可建立会话的用户---" + cloudList);
        return AjaxResult.success(cloudList);
    }

    // 创建会话
    @GetMapping("/createSession")
    public AjaxResult<?> createSession(@RequestParam Integer id, @RequestParam Integer toUserId, @RequestParam String toUserName) {
        SessionList sessionList = new SessionList();
        sessionList.setUserId(id);
        sessionList.setUnReadCount(0);
        sessionList.setListName(toUserName);
        sessionList.setToUserId(toUserId);
        sessionListService.insert(sessionList);
        // 判断对方和我建立会话没有？ 没有也要建立
        Integer integer = sessionListService.selectIdByUser(toUserId, id);
        if (integer == null || integer <= 0) {
            User user = userMapper.selectByPrimaryKey(id);
            sessionList.setUserId(toUserId);
            sessionList.setToUserId(id);
            sessionList.setListName(user.getUname());
            sessionListService.insert(sessionList);
        }
        return AjaxResult.success();
    }

    // 删除会话
    @GetMapping("/delSession")
    public AjaxResult<?> delSession(@RequestParam Integer sessionId) {
        sessionListService.deleteByPrimaryKey(sessionId);
        return AjaxResult.success();
    }
}
