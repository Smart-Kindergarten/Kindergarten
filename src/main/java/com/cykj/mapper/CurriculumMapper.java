package com.cykj.mapper;

import com.cykj.bean.Curriculum;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/24 13:25
 * @desc:
 * 课程表数据处理
 */

@Repository
public interface CurriculumMapper {
    //（杨）查询课程表信息
    List<Curriculum> selectCurrAll(@Param("classId")int classId,@Param("date")String date);
}
