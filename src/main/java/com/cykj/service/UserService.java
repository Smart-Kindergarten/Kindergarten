package com.cykj.service;

import com.cykj.bean.User;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/30 22:48
 * @desc:
 */
public interface UserService {
    //查询用户ID
    int selectID(String acc);

    //家长信息
    User parentsInfo(int id);
}
