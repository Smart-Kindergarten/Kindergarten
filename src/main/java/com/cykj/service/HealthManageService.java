package com.cykj.service;

import com.cykj.bean.Healthbean;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/7/27
 * @desc:
 */
public interface HealthManageService {

    public List<Healthbean> selecthealth(int page , int pages);

    public boolean updatehealth(int babyheid,String babyname,String height,String weight,String eyesight,String temperature,String healthcondition );

    public List<Healthbean> selectAll();
}
