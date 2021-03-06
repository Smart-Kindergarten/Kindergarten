package com.cykj.service.impl;


import com.cykj.bean.*;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
import com.cykj.va.AttenAndUser;
import com.cykj.va.ChildHomeWork;
import com.cykj.va.CurrAndUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName: HealthServiceImpl
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/25
 */
@Service
@Controller
@RequestMapping("/Health")
public class HealthServiceImpl implements HealthService {
    @Autowired
    private HealthMapper healthMapper;

    @Override
    public List<Healthbean> selectHealth(String uaccount, int page, int pages) {
        List<Healthbean> health = healthMapper.selectHealth(uaccount, page, page);
        return health;
    }

    /**
     * @Description: 小程序根据手机查询宝宝体检数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-27 15:13
     */
    @Override
    public List<Healthbean> selHeaUphone(String uphone, int page, int pages) {
        return healthMapper.selHeaUphone(uphone, page, pages);
    }

    /**
     * @Description: 小程序根据手机查询宝宝课程表数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 2:03
     */
    @Override
    public List<CurrAndUser> selCurrAndUser(String uphone, int page, int pages) {
        return healthMapper.selCurrAndUser(uphone, page, pages);
    }

    /**
     * @Description: 小程序查询宝宝膳食数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 3:24
     */
    @Override
    public List<BabyFood> selBabyFood(int page, int pages) {
        return healthMapper.selBabyFood(page, pages);
    }

    /**
     * @Description: 小程序亲子作业
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 5:47
     */
    @Override
    public List<ChildHomeWork> selChildHomeWork(String uphone, int page, int pages) {
        return healthMapper.selChildHomeWork(uphone, page, pages);
    }

    /**
     * @Description: 提交作业至查看作业表
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-07 2:48
     */
    @Override
    public Boolean insertHomeWork(CheckHomework checkHomework) {
        return healthMapper.insertHomeWork(checkHomework);
    }


    /**
     * @Description: 往期作业
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-09 11:27
     */
    @Override
    public List<ChildHomeWork> selOldHomeWork(String uphone, int page, int pages) {
        return healthMapper.selOldHomeWork(uphone, page, pages);
    }


    /**
     * @Description: 安全教育答题存成绩于数据库
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-09 10:22
     */
    @Override
    public Boolean insertAnswer(String secScore, String videoId) {
        return healthMapper.insertAnswer(secScore, videoId);
    }


    /**
     * @Description: 查询绘本信息
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-10 3:57
     */
    @Override
    public List<FamilyRead> selHuiben(int page, int pages) {
        return healthMapper.selHuiben(page, pages);
    }


    /**
     * @Description: 查询校园公告信息
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-11 4:01
     */
    @Override
    public List<Announcement> selannouncement(int page, int pages) {
        return healthMapper.selannouncement(page, pages);
    }


    /**
     * @Description: 查看安全教育视频
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-12 1:06
     */
    @Override
    public List<SafetyEducation> selVideo(int page, int pages) {
        return healthMapper.selVideo(page, pages);
    }


    /**
     * @Description: 查询宝宝考勤信息
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-12 4:56
     */
    @Override
    public List<AttenAndUser> selectBabyAtten(String uphone, int page, int pages) {
        return healthMapper.selectBabyAtten(uphone, page, pages);
    }


    /**
     * @Description: 多条件查询园长端班级管理信息
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-13 2:37
     */
    @Override
    public List<ClassManagement> ClassInforAll(String bgtime, String overtime, String className, int page, int pages) {
        return healthMapper.ClassInforAll(bgtime, overtime, className, page, pages);
    }


    /**
     * @Description: 查询园长端班级总数
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-13 2:57
     */
    @Override
    public int ClaInforCount() {
        return healthMapper.ClaInforCount();
    }


    /**
     * @Description: 查询园长端班级教室
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-13 4:14
     */
    @Override
    public List<ClassManagement> selclassManage() {
        return healthMapper.selclassManage();
    }


    /**
     * @Description: 查询园长端班主任
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-14 2:43
     */
    @Override
    public List<ClassManagement> selTeacher() {
        return healthMapper.selTeacher();
    }


    /**
     * @Description: 修改园长端班级
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-13 9:10
     */
    @Override
    public Boolean updclaManage(String className, int teacher, String classRoom, int classId) {
        return healthMapper.updclaManage(className, teacher, classRoom, classId);
    }


    /**
     * @Description: 新增园长端班级
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-13 11:34
     */
    @Override
    public Boolean insertClaManage(String className, int teacher, String classRoom, String creationTime) {
        return healthMapper.insertClaManage(className, teacher, classRoom, creationTime);
    }


    /**
     * @Description: 删除园长端班级
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-13 12:48
     */
    @Override
    public Boolean delClaManage(int classId) {
        return healthMapper.delClaManage(classId);
    }


}
