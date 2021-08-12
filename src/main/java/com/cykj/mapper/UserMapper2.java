package com.cykj.mapper;

import com.cykj.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 23:03
 * @desc:
 */
@Mapper
public interface UserMapper2 {
    User selectUserByName(@Param("uAcc") String uAcc);

    User selectByPrimaryKey(int id);

    List<User> getCloudList(@Param("list") List<Integer> list, @Param("classId") int classId);
}
