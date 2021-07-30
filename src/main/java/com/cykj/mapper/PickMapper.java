package com.cykj.mapper;

import com.cykj.bean.pick;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/30 20:52
 * @desc:
 */
@Repository
public interface PickMapper {
    public List<pick> GetPick(String BID);
}
