package com.cykj.mapper;

import com.cykj.bean.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolMessageMapper {

    void upDateSchoolMessage(SchoolMessage schoolMessage);

    int checkTeacherAcc(User user);

    void upDateTeacher(User user);

    List<User> selectTeacher();

    void changeTeacher(User user);

    void deleteTeacher(int id);

    List<User> select(String uname);

    List<User> selectAllParents();

    List<BabyInf> selectAllBaby();

    List<User> checkParents(User user);

    void changeParents(User user);

    void deleteParents(int id);

    void addParents(User user);

    User checkParentsAcc(String acc);

    void addBaby(BabyInf babyInf);

    void changeBaby(BabyInf babyInf);

    void deleteBaby(int id);

    List<ClassManagement> checkAllClass();

    List<ClassManagement> selectAllClass();

    List<User> selectAllTeacher();

    void upDateBabyClass(BabyInf babyInf);

    void upDateTeacherClass(ClassManagement classManagement);

    List<ClassManagement> courseManagement();

    List<Curriculum> classSchedule(Curriculum curriculum);

    void changeClass(Curriculum curriculum);
}
