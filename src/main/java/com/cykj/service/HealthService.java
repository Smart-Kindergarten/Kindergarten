package com.cykj.service;

import com.cykj.bean.BabyFood;
import com.cykj.bean.Healthbean;
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
    public List<Healthbean> selectHealth(String uaccount,int page,int pages);

    //小程序根据手机查询宝宝体检数据
    public List<Healthbean> selHeaUphone(String uphone, int page, int pages);

    //小程序根据手机查询宝宝课程表数据
    public List<CurrAndUser> selCurrAndUser(String uphone, int page, int pages);

    //小程序查询宝宝膳食数据
    public List<BabyFood> selBabyFood(int page,int pages);

    //小程序亲子作业
    public List<ChildHomeWork> selChildHomeWork(String uphone, int page, int pages);

    String upFood(String breakFood,String lunch,String dinner,String time);

    String selectFood();

    String changeFood(String foodId,String date,String changeFood,String foodType,String time);
}
