package com.cykj.mapper;

import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/30 22:40
 * @desc:
 */
@Repository
public interface UserMapper {
    //查询用户ID
    int selectID(String acc);

}
