package com.cykj.service;

import com.cykj.bean.BabyFood;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/8/11
 * @desc:
 */
public interface FoodManageService {

    public List<BabyFood> selectAll(int page , int pages);
}
