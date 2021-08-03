package com.cykj.service;

import com.cykj.va.C_HVa;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/2 0:05
 * @desc: 查看作业
 */
public interface C_HService {
    //yang-----查找班级学生作业
    List<C_HVa> selectClassAll(int classId);

    //yang------作业评级
    String updateRating(int chId, String rating);
}
