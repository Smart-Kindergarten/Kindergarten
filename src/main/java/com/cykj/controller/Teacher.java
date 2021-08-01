package com.cykj.controller;

import com.cykj.bean.ClassManagement;
import com.cykj.bean.Curriculum;
import com.cykj.bean.PublishHomework;
import com.cykj.service.impl.ClassManagementServiceImpl;
import com.cykj.service.impl.CurriculumServiceImpl;
import com.cykj.service.impl.P_HServiceImpl;
import com.cykj.service.impl.UserServiceImpl;
import com.cykj.utils.Parameter;
import com.cykj.utils.WeekDate;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/26 9:55
 * @desc: 教师端
 */

@Controller
@RequestMapping("/teacher")
public class Teacher {
    private Gson gson = new Gson();
    @Autowired
    private CurriculumServiceImpl curriculumService;
    @Autowired
    private ClassManagementServiceImpl managementService;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private P_HServiceImpl pHService;

    //查询当前日期课程表
    @RequestMapping("/selectCurrAll")
    @ResponseBody
    public String getCurrAll(String date) {
        System.out.println("-------查询课程表-------");
        String monday = WeekDate.getMonday(date);
        System.out.println(date + "这周的第一天：" + monday);
        List<Curriculum> currAll = curriculumService.selectCurrAll(monday);
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
        String s = gson.toJson(currAll);
        System.out.println(s);
        return s;
    }

    //获得教师所在的班级
    @ResponseBody
    @RequestMapping("/getClassName")
    public String getClassName(String uAccount) {
        System.out.println("-------查询教师所在的班级名称-------");
        System.out.println("uAccount:" + uAccount);
        List<ClassManagement> allClass = managementService.selectAllClass(uAccount);
        System.out.println(allClass);
        String s = gson.toJson(allClass);
        return s;
    }

    @ResponseBody
    @RequestMapping("/upHomework")
    public String upHomework(int id, String uacc) {
        System.out.println("-------发布作业-------");
        PublishHomework homework = new PublishHomework();
        homework.setClassId(id);//班级id
        homework.setTeacherId(userService.selectID(uacc));//教师id
        homework.setHomeworkContent(Parameter.getFileName());//文件名
        homework.setArrangementTime(WeekDate.getCurrentTime());//发布时间
        homework.setHomeworkURL(Parameter.getPublishHomeworkPath());//URL
        int i = pHService.insertAll(homework);
        if (i > 0) {
            return "发布成功";
        } else {
            return "发布失败";
        }
    }
}
