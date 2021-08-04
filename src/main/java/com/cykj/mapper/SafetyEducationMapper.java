package com.cykj.mapper;

import com.cykj.bean.SafetyEducation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/24 13:27
 * @desc: 安全教育
 */

@Repository
public interface SafetyEducationMapper {
    //    （yang）查询安全教育
    List<SafetyEducation> selectSafEduAll();

    //    (yang)安全教育视频开始时间和结束时间
    int updateTime(SafetyEducation safetyEducation);
}
