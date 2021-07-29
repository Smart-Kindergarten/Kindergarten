package com.cykj.controller;

import com.cykj.bean.Curriculum;
import com.cykj.service.impl.CurriculumServiceImpl;
import com.cykj.utils.WeekDate;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/26 9:55
 * @desc:
 */

@Controller
@RequestMapping("/teacher")
public class Teacher {
    @Autowired
    private CurriculumServiceImpl curriculumService;

    //查询当前日期课程表
    @RequestMapping("/selectCurrAll")
    @ResponseBody
    public String getCurrAll(String date) {
        System.out.println("-------查询课程表-------");
        String monday = WeekDate.getMonday(date);
        System.out.println(date + "这周的第一天：" + monday);
        List<Curriculum> currAll = curriculumService.selectCurrAll(monday);
        Gson gson = new Gson();
        String s = gson.toJson(currAll);
        System.out.println(s);
        return s;
    }

    //查询当前日期的上周或下周课程表
    @ResponseBody
    @RequestMapping("/getWeekDate")
    public String getWeekCurrAll(String week) {
        System.out.println("-------查询课程表-------");
        String date = WeekDate.getDate(week);//获取到日期的上周或下周
        String monday = WeekDate.getMonday(date);//获取到上周或下周的第一天（星期一为一周开始）
        System.out.println("日期：" + monday);
        List<Curriculum> currAll = curriculumService.selectCurrAll(monday);
        Gson gson = new Gson();
        String s = gson.toJson(currAll);
        System.out.println(s);
        return s;
    }


}
