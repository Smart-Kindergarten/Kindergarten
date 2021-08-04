package com.cykj.service;

import com.cykj.va.CheckSafEduTestRecord;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 21:30
 * @desc: 安全教育试题记录表
 */
public interface SE_Service {
    //按班级查询记录
    List<CheckSafEduTestRecord> selectTestRecord(int classId);

    //模糊查询试题记录
    List<CheckSafEduTestRecord> fuzzySelect(int classId, int pId, String wDate1, String wDate2);
}
