package com.cykj.service.impl;

import com.cykj.bean.Param;
import com.cykj.mapper.ParamMapper;
import com.cykj.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 20:26
 * @desc:
 */
@Service
public class ParamServiceImpl implements ParamService {
    @Autowired
    private ParamMapper paramMapper;

    @Override
    public List<Param> select(String type) {
        List<Param> list = paramMapper.select(type);
        if (!list.isEmpty()) {
            return list;
        }
        return null;
    }
}
