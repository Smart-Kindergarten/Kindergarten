package com.cykj.mapper;

import com.cykj.bean.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 20:22
 * @desc: 参数
 */
@Repository
public interface ParamMapper {
    //查询pzid，pname
    List<Param> select(String type);
}
