package com.cykj.controller;


import com.alibaba.fastjson.JSON;
import com.cykj.bean.BabyFood;
import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
import com.cykj.service.impl.HealthServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Autowired
    private HealthServiceImpl service;

    @GetMapping("/HealthAll")
    public @ResponseBody
    String GGB2(@RequestParam("page") int page, @RequestParam("uaccount") String uaccount) {
        System.out.println("保健信息进来了");
        System.out.println(page);
        System.out.println(uaccount);
        List<Healthbean> health = healthMapper.selectHealth(uaccount, (page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        System.out.println(s);
        return s;
    }

    /**
     * @Description: 小程序幼儿保健
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-28 15:34
     */
    @ResponseBody
    @GetMapping("/selHeaUphone")
    public String selHeaUphone(@RequestParam("page") int page, @RequestParam("uphone") String uphone) {
        System.out.println("手机保健信息进来了");
        System.out.println(page);
        System.out.println(uphone);
        List<Healthbean> health = healthMapper.selHeaUphone(uphone, (page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        System.out.println(s);
        return s;
    }



    /**
     * @Description: 小程序幼儿保健
     * @Param:
     * @Author: 胡金义
     * @Date: 2021-08-4 15:34
     */
    @ResponseBody
    @GetMapping("/upBabyFood")
    public String upFood(String breakFood,String lunch,String dinner,String time) {
        System.out.println(breakFood+"!!"+time);
        System.out.println(lunch);
        System.out.println(dinner);
        String check = service.upFood(breakFood,lunch,dinner,time);
        return check;
    }

    @ResponseBody
    @GetMapping("/selectFood")
    public String selectFood() {
        System.out.println("111111111111");
        String msg = service.selectFood();
        return msg;
    }

    @ResponseBody
    @GetMapping("/changeFood")
    public String changeFood(String foodId,String date,String changeFood,String foodType,String time) {
        String meg = service.changeFood(foodId,date,changeFood,foodType,time);
        return meg;
    }

}
