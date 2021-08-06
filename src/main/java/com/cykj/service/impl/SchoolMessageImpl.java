package com.cykj.service.impl;

import com.alibaba.fastjson.JSON;
import com.cykj.bean.BabyInf;
import com.cykj.bean.SchoolMessage;
import com.cykj.bean.User;
import com.cykj.mapper.SchoolMessageMapper;
import com.cykj.service.SchoolMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class SchoolMessageImpl implements SchoolMessageService {
    @Autowired
    SchoolMessageMapper messageMapper;

    @Override
    public int upDateSchoolMessage(SchoolMessage schoolMessage) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
            sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
            Date date = new Date();// 获取当前时间
            System.out.println("现在时间：" + sdf.format(date)); // 输出已经格式化的现在时间(24小时制)
            schoolMessage.setApplicationDeadline(sdf.format(date));
            schoolMessage.setType("待审核");
            messageMapper.upDateSchoolMessage(schoolMessage);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    @Override
    public String upDateTeacher(User user) {
        try {
            switch (user.getUres1()){
                case "班主任":
                    user.setUrid(2);
                    user.setUwork("老师");
                    break;
                case "保健员":
                    user.setUrid(4);
                    user.setUwork("保健员");
                    break;
                case "安防员":
                    user.setUrid(5);
                    user.setUwork("安防员");
                    break;
            }
            user.setUstate("8");
            user.setUpwd("123456");
            messageMapper.upDateTeacher(user);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public int checkTeacherAcc(User user) {
        try {
            int checkAns = messageMapper.checkTeacherAcc(user);
            System.out.println(checkAns);
            return checkAns;
        }catch (Exception e){
            System.out.println(e);
            return 0;
        }
    }

    @Override
    public List<User> selectTeacher() {
        List<User> users = messageMapper.selectTeacher();
        return users;
    }

    @Override
    public String changeTeacher(User user) {
        user.setUid(Integer.parseInt(user.getUres1()));
        try {
            switch (user.getUres2()){
                case "2":
                    user.setUrid(2);
                    user.setUwork("老师");
                    break;
                case "4":
                    user.setUrid(4);
                    user.setUwork("保健员");
                    break;
                case "5":
                    user.setUrid(5);
                    user.setUwork("安防员");
                    break;
            }
            messageMapper.changeTeacher(user);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public String deleteTeacher(int id) {
        try {
            messageMapper.deleteTeacher(id);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public List<User> select(String uname) {
        List<User> users = messageMapper.select(uname);
        return users;
    }

    @Override
    public String selectAllParents() {
        List<User> users = messageMapper.selectAllParents();
        for (int i=0;i<users.size();i++){
            User user = users.get(i);
            String time = user.getUres3();
            Long timestamp = Long.parseLong(time)*1;
            String date = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:MM").format(new java.util.Date(timestamp));
            user.setUres3(date);
        }
        System.out.println(users);
        String msg = JSON.toJSONString(users);
        return msg;
    }

    @Override
    public String selectAllBaby() {
        List<BabyInf> babyInfs = messageMapper.selectAllBaby();
        String msg = JSON.toJSONString(babyInfs);
        System.out.println(msg);
        return msg;
    }

    @Override
    public String checkParents(String time, String pName) {
        System.out.println(time+"!!"+pName);
        String []times = time.split(",");
        User user = new User();
        user.setUres1(times[0]);
        user.setUres2(times[1]);
        user.setUname(pName);
        List<User> users = messageMapper.checkParents(user);
        String msg = JSON.toJSONString(users);
        System.out.println(users);
        return msg;
    }

    @Override
    public String changeParents(String name, String babyName, String relation, String work,String pid) {
        try {
            String []BN = babyName.split("-");
            User user = new User();
            user.setUid(Integer.parseInt(pid));
            user.setUres1(BN[1]);
            user.setUname(name);
            user.setUchildrelation(relation);
            user.setUwork(work);
            messageMapper.changeParents(user);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public String deleteParents(int id) {
        try {
            messageMapper.deleteParents(id);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public String addParents(User user) {
        try {
            System.out.println(user.getBiname());
            String []msg = user.getBiname().split("-");
            String time = String.valueOf(System.currentTimeMillis());
            user.setUres3(time);
            user.setBiname(msg[1]);
            System.out.println(user.getBiname());
            messageMapper.addParents(user);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public String checkParentsAcc(String uaccount) {
        try {
            User user = messageMapper.checkParentsAcc(uaccount);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public String addBaby(BabyInf babyInf) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
            sdf.applyPattern("yyyy-MM-dd HH:mm");// a为am/pm的标记
            Date date = new Date();// 获取当前时间
            System.out.println("现在时间：" + sdf.format(date)); // 输出已经格式化的现在时间(24小时制)
            babyInf.setBiadtime(sdf.format(date));
            messageMapper.addBaby(babyInf);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public String changeBaby(BabyInf babyInf) {
        try {
            System.out.println(babyInf.getBiname()+"!"+babyInf.getBisex()+"!"+babyInf.getBiytd());

            messageMapper.changeBaby(babyInf);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }

    @Override
    public String selectBaby(String ptime, String pName) {
        System.out.println(ptime+"!"+pName);
        try {
            String []times = ptime.split(",");
            long timeOne = Long.parseLong(times[0]);
            long timeTow = Long.parseLong(times[1]);
            System.out.println(timeOne+"!`!");
            System.out.println(timeTow+"!`!");
            List<BabyInf> babyInfs = messageMapper.selectAllBaby();
            for (BabyInf babyInf : babyInfs) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String mydate = babyInf.getBiytd();
                Date datetime = sdf.parse(mydate);;//将你的日期转换为时间戳
                String time = String.valueOf(datetime.getTime());
                System.out.println(Long.parseLong(time)+"!--!");
                if (Long.parseLong(time)>=timeOne&& Long.parseLong(time)<=timeTow && pName.equals(babyInf.getBiname())){
                    List<BabyInf> babyInfs1 = new ArrayList<BabyInf>();
                    babyInfs1.add(babyInf);
                    String msg = JSON.toJSONString(babyInfs1);
                    System.out.println(msg);
                    return msg;
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
