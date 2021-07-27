package com.cykj.service;

import com.cykj.bean.Curriculum;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/26 11:00
 * @desc:
 */

public interface CurriculumService {
    //（杨）查询课程表信息
    List<Curriculum> selectCurrAll(String date);
}
