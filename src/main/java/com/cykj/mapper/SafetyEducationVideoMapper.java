package com.cykj.mapper;

import com.cykj.bean.FamilyRead;
import com.cykj.bean.SafetyEducation;
import com.cykj.bean.TerraceInformationBean;
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
    public  boolean inseVideo(String videoName,String releaseTime,String fileName,String fileSite);

    // 删除安全教育视频信息
    public boolean delectVideo(String prop);

    // 修改安全教育视频
    public  boolean updateVideo(String videoName,String releaseTime,String fileName,int videoId);

    // 修改试题地址
    public boolean updateQuestions(String textUrl,int videoId);

    // 获取绘本信息
    public List<FamilyRead> selectRead(int page,int pages);

    // 获取平台资讯
    public List<TerraceInformationBean>  selectTerraceInf(int page,int pages);

    // 新增平台资讯
    public  boolean insTerraceInf(String iftcontent,String Createtime,String reserve1,String reserve3);

    // 修改平台资讯
    public boolean updateTerraceInf(String iftcontent,String Createtime,String reserve1,int ttid);

    // 删除平台资讯
    public  boolean delectTerraceInf(int ttid);

    // 发布资讯
    public boolean updatereserve2(int ttid);

    // 查询资讯类型
    public List<TerraceInformationBean> selectType(String reserve3);

    // 查询家长查看视频信息
    public List<SafetyEducation> selectParentsVideo(int page,int pages);
}
