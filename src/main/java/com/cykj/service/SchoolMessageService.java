package com.cykj.service;

import com.cykj.bean.SchoolMessage;
import com.cykj.bean.User;

import java.util.List;

public interface SchoolMessageService {
    int upDateSchoolMessage(SchoolMessage schoolMessage);

    String upDateTeacher(User user);

    int checkTeacherAcc(User user);

    List<User> selectTeacher();

    String changeTeacher(User user);

    String deleteTeacher(int id);

    List<User> select(String uname);

}
