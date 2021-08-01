package com.cykj.mapper;

import com.cykj.bean.ClassManagement;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/30 14:47
 * @desc: 班级管理
 */
@Repository
public interface ClassManagementMapper {
    //(杨)查询教师所教的所有班级
    List<ClassManagement> selectAllClass(int id);
}
