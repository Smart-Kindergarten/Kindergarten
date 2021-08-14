package com.cykj.controller;

import com.cykj.bean.Healthbean;
import com.cykj.bean.SchoolMessage;
import com.cykj.mapper.intelligenceMapper;

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
 * @Date: 2021/8/10
 * @desc:
 */
@Controller
@RequestMapping("/intelligence")
public class intelligence {

       @Autowired
    private intelligenceMapper intelligenceMapper;

    @GetMapping("/intelligenceAll")
    public @ResponseBody
    String selectAll(int page, int pagesize){
        List<SchoolMessage> list = intelligenceMapper.selectAll((page-1)*pagesize,pagesize);
        Gson gson = new Gson();
        String g = gson.toJson(list);
        System.out.println(g);
        return g;

    }
    @GetMapping("/update")
    public @ResponseBody String update(String type,String EnrolmentTime,int ID){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        String shijian = simpleDateFormat.format(date);
        boolean b = intelligenceMapper.update("未通过",shijian,ID);

        Gson gson = new Gson();
        String s = null;
        if (b) {
            s = gson.toJson("200");
        } else {
            s = gson.toJson("100");
        }
        return s;
    }
    @GetMapping("/updateAll")
    public @ResponseBody String updateAll(String type,String EnrolmentTime,int ID){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        String shijian = simpleDateFormat.format(date);
        boolean b = intelligenceMapper.update("通过审批",shijian,ID);

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
    public @ResponseBody
    String select(String applicationDeadline,String applicationDeadlines,String type,String schoolName,int page){
        System.out.println(applicationDeadline);
        System.out.println(applicationDeadlines);
        System.out.println(type);
        System.out.println(schoolName);
        System.out.println(page);
        List<SchoolMessage> list = intelligenceMapper.select(applicationDeadline,applicationDeadlines
        ,type,schoolName,(page-1)*5,5);

        Gson gson = new Gson();
        String g = gson.toJson(list);
        System.out.println(g);
        return g;

    }

}
