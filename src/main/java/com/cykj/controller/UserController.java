package com.cykj.controller;

import com.cykj.bean.User;
import com.cykj.mapper.UserMapper2;
import com.cykj.service.impl.UserServiceImpl;
import com.cykj.utils.AjaxResult;
import com.cykj.utils.CurPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 18:01
 * @desc:
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper2 userMapper;

    //登录
    @GetMapping("/login")
    public AjaxResult<?> login(HttpServletRequest req) {
        System.out.println("---登录---");
        String uAcc = (String) req.getSession().getAttribute("uaccount");
        User user = userMapper.selectUserByName(uAcc);
        System.out.println("---登录---" + user);
        if (user == null) {
            return AjaxResult.failure("该用户不存在");
        }
        if (CurPool.curUserPool.get(user.getUid()) != null) {
            return AjaxResult.failure("该用户已登录");
        }
        CurPool.curUserPool.put(user.getUid(), user);
        return AjaxResult.success(user);
    }

    // 注销
    @GetMapping("/loginOut")
    public AjaxResult<?> loginOut(HttpServletRequest req) {
        System.out.println("---注销---");
        String uAcc = (String) req.getSession().getAttribute("uaccount");
        if (uAcc != null && !"".equals(uAcc)) {
            User user = userMapper.selectUserByName(uAcc);
            System.out.println("---注销---" + user);
            CurPool.curUserPool.remove(user.getUid());
            CurPool.sessionPool.remove(user.getUid());
            CurPool.webSockets.remove(user.getUid());
            System.out.println("【websocket消息】连接断开，总数为:" + CurPool.webSockets.size());
        }
        return AjaxResult.success();
    }
}
