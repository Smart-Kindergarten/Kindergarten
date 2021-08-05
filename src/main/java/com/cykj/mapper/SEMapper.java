package com.cykj.mapper;

import com.cykj.va.CheckSafEduTestRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/24 13:26
 * @desc: 安全教育试题记录
 */

@Repository
public interface SEMapper {
    //按班级查询记录
    List<CheckSafEduTestRecord> selectTestRecord(int classId);

    //模糊查询试题记录
    List<CheckSafEduTestRecord> fuzzySelect(@Param("classId") int classId, @Param("pId") int pId, @Param("wDate1") String wDate1, @Param("wDate2") String wDate2);
}
