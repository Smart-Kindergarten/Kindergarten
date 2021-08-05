package com.cykj.service.impl;

import com.cykj.bean.BabyInf;
import com.cykj.mapper.BabyInfMapper;
import com.cykj.service.BabyInfService;
import com.cykj.va.ClassInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/5 20:00
 * @desc:
 */

@Service
public class BabyInfServiceImpl implements BabyInfService {
    @Autowired
    private BabyInfMapper babyInfMapper;

    @Override
    public List<ClassInfo> selectClassInfo(int classId) {
        List<ClassInfo> infoList = babyInfMapper.selectClassInfo(classId);
        if (!infoList.isEmpty()) {
            return infoList;
        }
        return null;
    }

    @Override
    public List<ClassInfo> fuzzySelectClassInfo(int classId, String aTime1, String aTime2) {
        List<ClassInfo> infoList = babyInfMapper.fuzzySelectClassInfo(classId, aTime1, aTime2);
        if (!infoList.isEmpty()) {
            return infoList;
        }
        return null;
    }

    @Override
    public BabyInf selectBabyInfo(int id) {
        BabyInf babyInf = babyInfMapper.selectBabyInfo(id);
        if (babyInf != null) {
            return babyInf;
        }
        return null;
    }
}
