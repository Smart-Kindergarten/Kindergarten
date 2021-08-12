package com.cykj.utils;

import com.cykj.bean.User;
import com.cykj.controller.WebSocket;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 13:41
 * @desc: 统一管理session、websocket、curUser
 */
public class CurPool {
    //    public static CopyOnWriteArraySet<WebSocket> webSockets =new CopyOnWriteArraySet<>();
    public static Map<Integer, WebSocket> webSockets = new ConcurrentHashMap<>();
    // list 里面第一个存sessionId，第二个存session
    public static Map<Integer, List<Object>> sessionPool = new ConcurrentHashMap<>();
    // 当前登录用户x
    public static Map<Integer, User> curUserPool = new ConcurrentHashMap<>();
}
