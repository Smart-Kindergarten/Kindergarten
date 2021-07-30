package com.cykj.mapper;

import com.cykj.bean.pick;

import java.util.List;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/30 20:52
 * @desc:
 */
public interface PickMapper {
    public List<pick> GetPick(String BID);
}
