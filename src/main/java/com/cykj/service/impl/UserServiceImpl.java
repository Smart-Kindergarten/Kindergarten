package com.cykj.service.impl;

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
}
