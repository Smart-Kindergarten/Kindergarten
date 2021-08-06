package com.cykj.mapper;

import com.cykj.bean.BabyInf;
import com.cykj.bean.SchoolMessage;
import com.cykj.bean.User;
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
}
