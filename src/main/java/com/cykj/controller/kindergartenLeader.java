package com.cykj.controller;


import com.alibaba.fastjson.JSON;
import com.cykj.bean.SchoolMessage;
import com.cykj.bean.TeacherManagement;
import com.cykj.bean.User;
import com.cykj.service.SchoolMessageService;
import com.cykj.service.impl.SchoolMessageImpl;
import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description: 园长端
 * @Author: hjy
 * @Date: 2021/7/30
 */
@RestController
public class kindergartenLeader {
    @Autowired
    SchoolMessageService message;

    @ResponseBody
    @RequestMapping("/upData")
    public String upData(SchoolMessage schoolMessage){
        int checkUp = message.upDateSchoolMessage(schoolMessage);
        if (checkUp==1){
            return "成功";
        }else {
            return "失败";
        }
    }

    @ResponseBody
    @RequestMapping("/upTeacher")
    public String upTeacherData(User user){
        String upTeacher = message.upDateTeacher(user);
        return upTeacher;
    }

    @ResponseBody
    @RequestMapping("/checkAcc")
    public String checkTeacherAcc(User user){
        int checkAns = message.checkTeacherAcc(user);
        if (checkAns>0){
            return "已注册";
        }else {
            return "未注册";
        }
    }

    @ResponseBody
    @RequestMapping("/select")
    public String selectTeacher(){
        List<User> userList = message.selectTeacher();
        List<User> users = new ArrayList<>();
        for (int i=0;i<userList.size();i++){
            User user = userList.get(i);
            if (user.getUrid()==2){
                user.setUpwd("老师");
                users.add(user);
            }
            if (user.getUrid()==4){
                user.setUpwd("保健员");
                users.add(user);
            }
            if (user.getUrid()==5){
                user.setUpwd("安防员");
                users.add(user);
            }
        }
        String msg = JSON.toJSONString(users);
        return msg;
    }

    @ResponseBody
    @RequestMapping("/upDateTeacher")
    public String changeTeacher(User user) {
        String check = message.changeTeacher(user);
        return check;
    }

    @ResponseBody
    @RequestMapping("/deleteTeacher")
    public String deleteTeacher(String id) {
        String check = message.deleteTeacher(Integer.parseInt(id));
        return check;
    }

    @ResponseBody
    @RequestMapping("/selectTeacher")
    public String select(String uname) {
        System.out.println(uname);
        List<User> users = message.select(uname);
        for (User user : users) {
            if (user.getUrid()==2||user.getUrid()==4||user.getUrid()==5){
                System.out.println(users);
                String msg = JSON.toJSONString(users);
                return msg;
            }else {
                return null;
            }
        }
        return null;
    }

    @ResponseBody
    @RequestMapping("/selectAllParents")
    public String selectAllParents() {
        String msg = message.selectAllParents();
        return msg;
    }

    @ResponseBody
    @RequestMapping("/selectAllBaby")
    public String selectAllBaby() {
        String msg = message.selectAllBaby();
        return msg;
    }

    @ResponseBody
    @RequestMapping("/checkParents")
    public String checkParents(String time,String name) {
        String msg = message.checkParents(time,name);
        return msg;
    }

    @ResponseBody
    @RequestMapping("/changeParents")
    public String changeParents(String name,String babyName,String relation,String work,String pid) {
        System.out.println(name+"!"+babyName+"!"+relation+"!"+work);
        String msg = message.changeParents(name,babyName,relation,work,pid);
        return msg;
    }

    @ResponseBody
    @RequestMapping("/deleteParents")
    public String deleteParents(String id) {
        String msg = message.deleteParents(Integer.parseInt(id));
        return msg;
    }

    @ResponseBody
    @RequestMapping("/addParents")
    public String addParents(User user) {
        String msg = message.addParents(user);
        return msg;
    }

    @ResponseBody
    @RequestMapping("/checkParentsAcc")
    public String checkParentsAcc(String uaccount) {
        String msg = message.checkParentsAcc(uaccount);
        return msg;
    }
}
