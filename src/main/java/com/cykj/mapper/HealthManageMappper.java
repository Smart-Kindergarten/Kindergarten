package com.cykj.mapper;

import com.cykj.bean.BabyFood;
import com.cykj.bean.Healthbean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/7/27
 * @desc:
 */

@Repository
public interface HealthManageMappper {

    public List<Healthbean> selecthealth(int page , int pages);

    public boolean updatehealth(int babyheid, String babyname, String height, String weight, String eyesight, String temperature, String healthcondition);

    public List<Healthbean> selectAll();

    public boolean inserthealth(String babyname,String height,String weight,String eyesight,String temperature,String healthcondition,String checkuptime);

    // 查询宝宝膳食
    public List<BabyFood> lookFood(int page,int pages);
}
