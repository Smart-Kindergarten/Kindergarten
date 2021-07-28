package com.cykj.service;

import com.cykj.bean.SafetyEducation;

import java.util.List;

public interface SafetyEducationVideoService {
    // 查询安全教育视频信息
    List<SafetyEducation> selectAll(int page,int pages);

    // 查询安全教育视频信息
    public  boolean inseVideo(String videoName,String releaseTime,String fileName,String fileSite);

    // 删除安全教育视频信息
    public boolean delectVideo(String prop);

    // 修改安全教育视频
    public  boolean updateVideo(String videoName,String releaseTime,String fileName,int videoId);
}
