package com.cykj.service;

import com.cykj.bean.BabyInf;
import com.cykj.va.ClassInfo;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/5 20:00
 * @desc:
 */
public interface BabyInfService {
    //    联表查询宝宝信息
    List<ClassInfo> selectClassInfo(int classId);

    //    联表模糊查询宝宝入学时间
    List<ClassInfo> fuzzySelectClassInfo(int classId, String aTime1, String aTime2);

    //宝宝信息
    BabyInf selectBabyInfo(int id);
}
