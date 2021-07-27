package com.cykj.mapper;

import com.cykj.bean.Healthbean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthMapper {
    // 查询宝宝保健信息
    public List<Healthbean> selectHealth(String uaccount,int page,int pages);
}
