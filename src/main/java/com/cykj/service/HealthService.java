package com.cykj.service;

import com.cykj.bean.*;
import com.cykj.va.AttenAndUser;
import com.cykj.va.ChildHomeWork;
import com.cykj.va.CurrAndUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: HealthService
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/25
 */
@Service
public interface HealthService {
    // 查询宝宝保健信息
    public List<Healthbean> selectHealth(String uaccount, int page, int pages);

    //小程序根据手机查询宝宝体检数据
    public List<Healthbean> selHeaUphone(String uphone, int page, int pages);

    //小程序根据手机查询宝宝课程表数据
    public List<CurrAndUser> selCurrAndUser(String uphone, int page, int pages);

    //小程序查询宝宝膳食数据
    public List<BabyFood> selBabyFood(int page, int pages);

    //小程序亲子作业
    public List<ChildHomeWork> selChildHomeWork(String uphone, int page, int pages);

    //提交作业至查看作业表
    public Boolean insertHomeWork(CheckHomework checkHomework);

    //往期作业
    public List<ChildHomeWork> selOldHomeWork(String uphone, int page, int pages);

    //安全教育答题存成绩于数据库
    public Boolean insertAnswer(String secScore, String videoId);

    //查询绘本信息
    public List<FamilyRead> selHuiben(int page, int pages);

    //查询校园公告信息
    public List<Announcement> selannouncement(int page, int pages);

    //查询安全教育视频
    public List<SafetyEducation> selVideo(int page, int pages);

    //查询宝宝考勤信息
    public List<AttenAndUser> selectBabyAtten(String uphone, int page, int pages);

    //多条件查询园长端班级管理信息
    public List<ClassManagement> ClassInforAll(String bgtime, String overtime, String className, int page, int pages);

    //查询园长端班级总数
    public int ClaInforCount();

    //查询园长端班级教室
    public List<ClassManagement> selclassManage();

    //查询园长端班主任
    public List<ClassManagement> selTeacher();

    //修改园长端班级
    public Boolean updclaManage(String className, int teacher, String classRoom,int classId);

    //新增园长端班级
    public Boolean insertClaManage(String className, int teacher, String classRoom, String creationTime);

    //删除园长端班级
    public Boolean delClaManage(int classId);
}
