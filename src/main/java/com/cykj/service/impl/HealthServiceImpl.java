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
    public List<Healthbean> selectHealth(int page,int pages) {
        List<Healthbean> health = healthMapper.selectHealth(page,page);
        return health;
    }
}
