package com.cykj.service.impl;

import com.cykj.bean.SchoolMessage;
import com.cykj.bean.User;
import com.cykj.mapper.SchoolMessageMapper;
import com.cykj.service.SchoolMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
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



}
