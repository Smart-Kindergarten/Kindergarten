package com.cykj.mapper;

import com.cykj.bean.*;
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
    public List<FamilyRead> selectRead(String left,String right,String bookname,int page,int pages);

    // 获取平台资讯
    public List<TerraceInformationBean>  selectTerraceInf(String left,String right,String iftcontent,int page,int pages);

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

    // 统计年龄
    public List<BabyInf> seleleBaby();

    // 查询男生人数
    public List<BabyInf> selectMan();

    // 查询女生人数
    public List<BabyInf> selectWoman();

    // 统计健康状况
    public List<Healthbean>  selecthealthCondition();

    // 菜单管理
    public List<Menu> selectMenu(String onename,String mename,int page,int pages);

    // 查询一级菜单
    public List<Menu> selectOne();

    // 修改菜单
    public boolean updateMenu(String mename,String menurl,int mepid);

    // 查询园所
    public List<SchoolMessage> selectSchool(String left,String right,String schoolName,int page,int pages);

    // 查询拥有的权限
    public List<Menu> selectMenuLeft(int meid);

    // 查询未拥有的权限
    public List<Menu>   selectMenuRight(int meid);

    //查询该权限是否存在
    public List<Menu> isidexit(int mid, int pid);

    //添加权限
    public boolean insertPower(int mid, int pid);

    //删除权限
    public boolean delPower(int mid, int pid);

    // 园所 禁用启用
    public boolean forbidden(String starta,int ID);


    // 园所 重置面膜
    public boolean resetpwd(int ID);

    // 删除园所
    public boolean delectID(int ID);

    // 修改园所
    public  boolean updateID(String schoolname,String schoolacc,Integer ID);
}
