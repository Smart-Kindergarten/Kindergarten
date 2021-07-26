package com.cykj.service.impl;

import com.cykj.bean.Curriculum;
import com.cykj.mapper.CurriculumMapper;
import com.cykj.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/26 11:00
 * @desc:
 */

@Service
public class CurriculumServiceImpl implements CurriculumService {

    @Autowired
    private CurriculumMapper curriculumMapper;

    @Override
    public List<Curriculum> selectCurrAll() {
        List<Curriculum> curriculumList = curriculumMapper.selectCurrAll();
        if (!curriculumList.isEmpty()) {
            return curriculumList;
        } else {
            return null;
        }
    }
}
