package com.cykj.service.impl;

import com.cykj.bean.BabyAtten;
import com.cykj.mapper.BabyAttenMapper;
import com.cykj.service.BabyAttenService;
import com.cykj.va.BabyAttenVa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/11 0:11
 * @desc:
 */
@Service
public class BabyAttenServiceImpl implements BabyAttenService {
    @Autowired
    private BabyAttenMapper attenMapper;

    @Override
    public List<BabyAttenVa> selectAll(int id) {
        List<BabyAttenVa> babyAttenVas = attenMapper.selectAll(id);
        if (!babyAttenVas.isEmpty()) {
            return babyAttenVas;
        }
        return null;
    }

    @Override
    public List<BabyAttenVa> fuzzySelectAll(int id, String name) {
        List<BabyAttenVa> babyAttenVas = attenMapper.fuzzySelectAll(id, name);
        if (!babyAttenVas.isEmpty()) {
            return babyAttenVas;
        }
        return null;
    }

    @Override
    public  List<BabyAtten> selectBabyAtten(int classId, int babyId, String date) {
        List<BabyAtten> babyAttens = attenMapper.selectBabyAtten(classId, babyId, date);
        if (!babyAttens.isEmpty()) {
            return babyAttens;
        }
        return null;
    }
}

