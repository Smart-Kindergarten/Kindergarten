package com.cykj.service.impl;

import com.cykj.bean.PublishHomework;
import com.cykj.mapper.P_HMapper;
import com.cykj.service.P_HService;
import com.cykj.va.P_H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 20:17
 * @desc:
 */

@Service
public class P_HServiceImpl implements P_HService {
    @Autowired
    private P_HMapper pHMapper;

    @Override
    public int insertAll(PublishHomework publishHomework) {
        int i = pHMapper.insertAll(publishHomework);
        return i;
    }

    @Override
    public List<P_H> selectClassPH(int classId) {
        List<P_H> list = pHMapper.selectClassPH(classId);
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }
}

