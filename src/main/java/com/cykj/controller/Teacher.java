package com.cykj.controller;

import com.cykj.bean.Curriculum;
import com.cykj.service.impl.CurriculumServiceImpl;
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

    @RequestMapping("/selectCurrAll")
    @ResponseBody
    private String getCurrAll() {
        System.out.println("-------查询课程表-------");
        List<Curriculum> currAll = curriculumService.selectCurrAll();
        Gson gson = new Gson();
        String s = gson.toJson(currAll);
        System.out.println(s);
        return s;
    }

}
