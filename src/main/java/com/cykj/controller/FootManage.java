package com.cykj.controller;

import com.cykj.bean.BabyFood;
import com.cykj.bean.SchoolMessage;
import com.cykj.mapper.FoodManageMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/8/11
 * @desc:
 */
@Controller
@RequestMapping("/FootManage")
public class FootManage {
    @Autowired
    private FoodManageMapper foodManageMapper;
    @GetMapping("/selectAll")
    public @ResponseBody
    String selectAll(int page, int pagesize){
        List<BabyFood> list = foodManageMapper.selectAll((page-1)*pagesize,pagesize);
        Gson gson = new Gson();
        String g = gson.toJson(list);
        System.out.println(g);
        return g;

    }

}
