package com.cykj.service;

import com.cykj.bean.FamilyRead;
import com.cykj.bean.SafetyEducation;
import com.cykj.bean.TerraceInformationBean;

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

    // 修改试题地址
    public boolean updateQuestions(String textUrl,int videoId);

    // 获取绘本信息
    public List<FamilyRead> selectRead(String UploadTime,String UploadTimes,String bookname,int page,int pages);

    // 获取平台资讯
    public List<TerraceInformationBean>  selectTerraceInf(String Createtime,String Createtimes,String iftcontent,int page,int pages);


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

    // 上传绘本
    public boolean inseRead(String bookname,String Folderaddress,String UploadTime,String reserve1,String reserve2,String reserve3);

    // 重新上传绘本
    public  boolean updateRead(String bookname,String Folderaddress,String UploadTime,String reserve1,String reserve2,int frid);

    // 删除绘本
    public boolean delectBook(int frid);


}
