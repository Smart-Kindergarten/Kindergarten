package com.cykj.service;

import com.cykj.bean.ClassMessage;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/9 23:36
 * @desc:
 */
public interface ClassMessageService {
    List<ClassMessage> selectAll(int classId);

    String insertClassMessage(ClassMessage classMessage);
}
