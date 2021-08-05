package com.cykj.mapper;

import com.cykj.bean.BabyInf;
import com.cykj.va.ClassInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/5 19:57
 * @desc:
 */
@Repository
public interface BabyInfMapper {
    //    联表查询宝宝信息
    List<ClassInfo> selectClassInfo(int classId);

    //    联表模糊查询宝宝入学时间
    List<ClassInfo> fuzzySelectClassInfo(@Param("classId") int classId, @Param("aTime1") String aTime1, @Param("aTime2") String aTime2);

    //宝宝信息
    BabyInf selectBabyInfo(int id);
}
