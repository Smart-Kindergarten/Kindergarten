package com.cykj.service.impl;

import com.cykj.bean.User;
import com.cykj.mapper.UserMapper;
import com.cykj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/30 22:48
 * @desc:
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int selectID(String acc) {
        int id = userMapper.selectID(acc);
        return id;
    }

    @Override
    public User parentsInfo(int id) {
        User user = userMapper.parentsInfo(id);
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public int getUserUrid(String acc) {
        return userMapper.getUserUrid(acc);
    }

    @Override
    public int babyClass(String acc) {
        int i = userMapper.babyClass(acc);
        if (i != 0) {
            return i;
        }
        return 0;
    }


}
