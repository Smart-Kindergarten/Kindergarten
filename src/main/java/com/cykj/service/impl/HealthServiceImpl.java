package com.cykj.service.impl;


import com.cykj.bean.BabyFood;
import com.cykj.bean.CheckHomework;
import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
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
}
