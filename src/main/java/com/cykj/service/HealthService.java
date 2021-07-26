package com.cykj.service;

import com.cykj.bean.Healthbean;
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
    public List<Healthbean> selectHealth(int page,int pages);
}
