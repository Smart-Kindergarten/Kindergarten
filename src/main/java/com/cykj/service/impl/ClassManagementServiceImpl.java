package com.cykj.service.impl;

import com.cykj.bean.ClassManagement;
import com.cykj.mapper.ClassManagementMapper;
import com.cykj.service.ClassManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/30 23:03
 * @desc:
 */
@Service
public class ClassManagementServiceImpl implements ClassManagementService {
    @Autowired
    private ClassManagementMapper classManagementMapper;

    @Override
    public List<ClassManagement> selectAllClass(String acc) {
        List<ClassManagement> allClass = classManagementMapper.selectAllClass(acc);
        if (!allClass.isEmpty()) {
            return allClass;
        } else {
            return null;
        }
    }

    @Override
    public String getClassName(int classId) {
        String className = classManagementMapper.getClassName(classId);
        return className;
    }
}
