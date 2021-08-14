package com.cykj.service.impl;

import com.cykj.bean.BabyFood;
import com.cykj.mapper.FoodManageMapper;
import com.cykj.service.FoodManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/8/11
 * @desc:
 */
@Service
@Controller
@RequestMapping("/FootManage")
public class FoodManageImpl implements FoodManageService {

   @Autowired
   private FoodManageMapper foodManageMapper;

    @Override
    public List<BabyFood> selectAll(int page , int pages) {
        List<BabyFood> list = foodManageMapper.selectAll(page, pages);
        return list;
    }
}
