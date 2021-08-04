package com.cykj.service.impl;

import com.cykj.mapper.SEMapper;
import com.cykj.service.SE_Service;
import com.cykj.va.CheckSafEduTestRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 21:31
 * @desc:
 */
@Service
public class SE_ServiceImpl implements SE_Service {
    @Autowired
    private SEMapper seMapper;

    @Override
    public List<CheckSafEduTestRecord> selectTestRecord(int classId) {
        List<CheckSafEduTestRecord> list = seMapper.selectTestRecord(classId);
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }

    @Override
    public List<CheckSafEduTestRecord> fuzzySelect(int classId, int pId, String wDate1, String wDate2) {
        List<CheckSafEduTestRecord> list = seMapper.fuzzySelect(classId, pId, wDate1, wDate2);
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }


}
