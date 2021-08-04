package com.cykj.service;

import com.cykj.bean.SafetyEducation;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 17:02
 * @desc: 安全教育
 */
public interface SafetyEducationService {
    //    （yang）查询安全教育
    List<SafetyEducation> selectSafEduAll();
    //    (yang)安全教育视频开始时间和结束时间
    String updateTime(SafetyEducation safetyEducation);
}
