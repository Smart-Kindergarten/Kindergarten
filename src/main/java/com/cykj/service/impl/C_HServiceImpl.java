package com.cykj.service.impl;

import com.cykj.mapper.C_HMapper;
import com.cykj.service.C_HService;
import com.cykj.va.C_HVa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/2 0:06
 * @desc: 查看作业
 */

@Service
public class C_HServiceImpl implements C_HService {
    @Autowired
    private C_HMapper cHMapper;

    @Override
    public List<C_HVa> selectClassAll(int classId) {
        List<C_HVa> classAll = cHMapper.selectClassAll(classId);
        if (!classAll.isEmpty()) {
            return classAll;
        }
        return null;
    }

    @Override
    public String updateRating(int chId, String rating) {
        int i = cHMapper.updateRating(chId, rating);
        if (i > 0) {
            return "修改完成！";
        }
        return "修改失败~";
    }
}
