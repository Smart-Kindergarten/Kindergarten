package com.cykj.service;

import com.cykj.bean.BabyAtten;
import com.cykj.va.BabyAttenVa;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/11 0:11
 * @desc:
 */
public interface BabyAttenService {
    List<BabyAttenVa> selectAll(int id);

    List<BabyAttenVa> fuzzySelectAll(int id, String name);

    List<BabyAtten> selectBabyAtten(int classId, int babyId, String date);

}
