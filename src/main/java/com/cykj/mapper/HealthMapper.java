package com.cykj.mapper;

import com.cykj.bean.Healthbean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthMapper {
    // 查询宝宝保健信息
    public List<Healthbean> selectHealth(String uaccount, int page, int pages);

    //小程序根据手机查询宝宝体检数据
    public List<Healthbean> selHeaUphone(String uphone, int page, int pages);
}
