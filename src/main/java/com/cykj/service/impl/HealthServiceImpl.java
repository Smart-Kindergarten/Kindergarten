package com.cykj.service.impl;


import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
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
}
