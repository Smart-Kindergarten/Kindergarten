package com.cykj.service.impl;

import com.cykj.bean.SafetyEducation;
import com.cykj.mapper.SafetyEducationMapper;
import com.cykj.service.SafetyEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 17:03
 * @desc:
 */
@Service
public class SafetyEducationServiceImpl implements SafetyEducationService {
    @Autowired
    private SafetyEducationMapper safetyEducationMapper;

    @Override
    public List<SafetyEducation> selectSafEduAll() {
        List<SafetyEducation> safEduAll = safetyEducationMapper.selectSafEduAll();
        if (!safEduAll.isEmpty()) {
            return safEduAll;
        }
        return null;
    }

    @Override
    public String updateTime(SafetyEducation safetyEducation) {
        int i = safetyEducationMapper.updateTime(safetyEducation);
        if (i > 0) {
            return "200";
        }
        return "100";
    }
}
