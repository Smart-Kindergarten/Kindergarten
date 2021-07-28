package com.cykj.mapper;

import com.cykj.bean.SafetyEducation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/24 13:27
 * @desc: 安全教育视频
 */

@Repository
public interface SafetyEducationVideoMapper {

    // 查询安全教育视频信息
    List<SafetyEducation> selectAll(int page,int pages);

    // 查询安全教育视频信息
    public  boolean inseVideo(String videoName,String releaseTime,String fileSite);
}
