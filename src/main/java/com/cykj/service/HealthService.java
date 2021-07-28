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
    public List<Healthbean> selectHealth(String uaccount,int page,int pages);

    //小程序根据手机查询宝宝体检数据
    public List<Healthbean> selHeaUphone(String uphone, int page, int pages);
}
