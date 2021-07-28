package com.cykj.controller;


import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
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

}
