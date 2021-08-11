package com.cykj.mapper;

import com.cykj.bean.BabyAtten;
import com.cykj.va.BabyAttenVa;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/11 0:06
 * @desc:
 */
@Repository
public interface BabyAttenMapper {
    List<BabyAttenVa> selectAll(int id);

    List<BabyAttenVa> fuzzySelectAll(int id, String name);

    List<BabyAtten> selectBabyAtten(@Param("classId") int classId, @Param("babyId") int babyId, @Param("date") String date);
}
