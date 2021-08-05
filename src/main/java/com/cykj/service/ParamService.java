package com.cykj.service;

import com.cykj.bean.Param;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 20:26
 * @desc:
 */
public interface ParamService {
    //查询pzid，pname
    List<Param> select(String type);
}
