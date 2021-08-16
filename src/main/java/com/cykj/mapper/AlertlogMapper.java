package com.cykj.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/8/14 23:33
 * @desc:
 */
@Repository
public interface AlertlogMapper {
    public boolean insert(@Param("BID") String BID, @Param("time")String time);
}
