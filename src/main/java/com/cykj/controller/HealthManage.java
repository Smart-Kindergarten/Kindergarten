package com.cykj.controller;

import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthManageMappper;
import com.cykj.service.HealthManageService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/7/27
 * @desc:
 */
@Controller
@RequestMapping("/Healthmanage")
public class HealthManage {

    @Autowired
    private HealthManageService healthManageService;
    @Autowired
    private HealthManageMappper healthManageMappper;

    @GetMapping("/HealthmanageAll")
    public @ResponseBody String health(int page,int pagesize){
        List<Healthbean> list = healthManageMappper.selecthealth((page-1)*pagesize,pagesize);
        Gson gson = new Gson();
        String g = gson.toJson(list);
        System.out.println(g);
        return g;

    }
    @GetMapping("/update")
    public @ResponseBody String update(int babyheid, String babyname, String height, String weight, String eyesight, String temperature, String healthcondition){
            boolean b = healthManageMappper.updatehealth(babyheid,babyname,height,weight,eyesight,temperature,healthcondition);
        Gson gson = new Gson();
        String s = null;
        if (b) {
            s = gson.toJson("200");
        } else {
            s = gson.toJson("100");
        }
        return s;
    }

    @GetMapping("/select")
    public @ResponseBody String select(){
        List<Healthbean> hlt = healthManageMappper.selectAll();
        Gson gson = new Gson();
        String g = gson.toJson(hlt);
        System.out.println(g);
        return g;
    }
   @GetMapping("/insert")
    public @ResponseBody String insert(String babyname,String height,String weight,String eyesight,String temperature,String healthcondition,String checkuptime){

       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
       Date date = new Date(System.currentTimeMillis());
       String shijian = simpleDateFormat.format(date);
        boolean b = healthManageMappper.inserthealth(babyname, height, weight, eyesight, temperature, healthcondition,shijian);
       Gson gson = new Gson();
       String s = null;
       if (b) {
           s = gson.toJson("200");
       } else {
           s = gson.toJson("100");
       }
       return s;
   }
}
