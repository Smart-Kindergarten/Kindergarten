package com.cykj.mapper;

import com.cykj.bean.Serialize;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/8/14 22:42
 * @desc: 序列表
 */
@Repository
public interface SerializeMapper {
    /**
     * 获取绑定序列号的基本信息
     * @param serialize 需要查询的序列化
     * @return 返回基本信息
     */
    public List<Serialize> getSerialize(@Param("serialize")String serialize);
}
