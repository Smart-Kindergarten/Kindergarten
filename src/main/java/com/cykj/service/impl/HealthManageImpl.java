package com.cykj.service.impl;

import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthManageMappper;
import com.cykj.service.HealthManageService;
import com.cykj.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/7/27
 * @desc:
 */
@Service
@Controller
@RequestMapping("/Healthmanage")
public class HealthManageImpl implements HealthManageService {

    @Autowired
    private HealthManageMappper healthManageMappper;

    @Override
    public List<Healthbean> selecthealth(int page , int pages) {

        List<Healthbean> list = healthManageMappper.selecthealth(page,pages);
        return list;
    }

    @Override
    public boolean updatehealth(int babyheid, String babyname, String height, String weight, String eyesight, String temperature, String healthcondition) {

        boolean b = healthManageMappper.updatehealth(babyheid,babyname,height,weight,eyesight,temperature,healthcondition);

        return b;
    }

    @Override
    public List<Healthbean> selectAll() {
        List<Healthbean> list = healthManageMappper.selectAll();
        return list;
    }

    @Override
    public boolean inserthealth(String babyname, String height, String weight, String eyesight, String temperature, String healthcondition ,String checkuptime) {
     boolean b = healthManageMappper.inserthealth(babyname, height, weight, eyesight, temperature, healthcondition,checkuptime);

        return b;
    }
}
