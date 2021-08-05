package com.cykj.mapper;

import com.cykj.bean.BabyFood;
import com.cykj.bean.Healthbean;
import com.cykj.va.ChildHomeWork;
import com.cykj.va.CurrAndUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthMapper {
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

    void upFood(BabyFood babyFood);

    List<BabyFood> selectFood();

    void changeFood(BabyFood babyFood);

    void upFoodTime(BabyFood babyFood);
}
