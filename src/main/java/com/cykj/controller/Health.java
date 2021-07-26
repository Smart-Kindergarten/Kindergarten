package com.cykj.controller;


import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @Author: ZW
 * @Date: 2021/7/25
 */
@Controller
@RequestMapping("/Health")
public class Health {

    @Autowired
    private HealthService healthService;
    @Autowired
    private HealthMapper healthMapper;
    @GetMapping("/HealthAll")
    public @ResponseBody
    String GGB2(int page){
        System.out.println("保健信息进来了");
        System.out.println(page);
        List<Healthbean> health = healthMapper.selectHealth((page-1)*5,page*5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        System.out.println(s);
        return s;
    }
}