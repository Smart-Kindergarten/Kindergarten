package com.cykj.mapper;

import com.cykj.bean.User;
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

    //家长信息
    User parentsInfo(int id);

    int getUserUrid(String acc);

    //    查询宝宝所在班级
    int babyClass(String acc);

}
