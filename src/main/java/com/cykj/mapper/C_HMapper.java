package com.cykj.mapper;

import com.cykj.va.C_HVa;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 23:58
 * @desc: 查看作业
 */

@Repository
public interface C_HMapper {
    //yang-----查找班级学生作业
    List<C_HVa> selectClassAll(int classId);

    //yang------作业评级
    int updateRating(@Param("chId") int chId, @Param("rating") String rating);
}
