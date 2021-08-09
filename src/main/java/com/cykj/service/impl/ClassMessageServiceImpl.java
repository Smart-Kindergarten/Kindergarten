package com.cykj.service.impl;

import com.cykj.bean.ClassMessage;
import com.cykj.mapper.ClassMessageMapper;
import com.cykj.service.ClassMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/9 23:36
 * @desc:
 */

@Service
public class ClassMessageServiceImpl implements ClassMessageService {
    @Autowired
    private ClassMessageMapper classMessageMapper;

    @Override
    public List<ClassMessage> selectAll(int classId) {
        List<ClassMessage> selectAll = classMessageMapper.selectAll(classId);
        if (!selectAll.isEmpty()) {
            return selectAll;
        }
        return null;
    }

    @Override
    public String insertClassMessage(ClassMessage classMessage) {
        int i = classMessageMapper.insertClassMessage(classMessage);
        if (i > 0) {
            return "新增成功";
        }
        return "新增失败";
    }
}
