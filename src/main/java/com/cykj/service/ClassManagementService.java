package com.cykj.service;

import com.cykj.bean.ClassManagement;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/30 23:03
 * @desc:
 */
public interface ClassManagementService {
    //(杨)查询教师所教的所有班级
    List<ClassManagement> selectAllClass(int id);
}
