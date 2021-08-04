package com.cykj.service.impl;

import com.cykj.bean.FamilyRead;
import com.cykj.bean.SafetyEducation;
import com.cykj.bean.TerraceInformationBean;
import com.cykj.mapper.SafetyEducationVideoMapper;
import com.cykj.mapper.TerraceMapper;
import com.cykj.service.SafetyEducationVideoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName: SafetyEducationVideoServiceImpl
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/27
 */
public class SafetyEducationVideoServiceImpl implements SafetyEducationVideoService {

    @Autowired
    private SafetyEducationVideoMapper safetyEducationVideoMapper;


    @Override
    public List<SafetyEducation> selectAll(int page,int pages) {
        List<SafetyEducation> safetyEducations = safetyEducationVideoMapper.selectAll(page,pages);
        return safetyEducations;
    }

    @Override
    public boolean inseVideo(String videoName, String releaseTime,String fileName, String fileSite) {
        boolean b = safetyEducationVideoMapper.inseVideo(videoName,releaseTime,fileName,fileSite);
        return b;
    }

    @Override
    public boolean delectVideo(String prop) {
        boolean b = safetyEducationVideoMapper.delectVideo(prop);
        return b;
    }

    @Override
    public boolean updateVideo(String videoName, String releaseTime,String fileName, int videoId) {
        boolean b = safetyEducationVideoMapper.updateVideo(videoName, releaseTime,fileName, videoId);
        return b;
    }
    // 修改试题地址

    @Override
    public boolean updateQuestions(String textUrl,int videoId) {
        boolean b = safetyEducationVideoMapper.updateQuestions(textUrl,videoId);
        return b;
    }

    @Override
    public List<FamilyRead> selectRead(int page,int pages) {
        List<FamilyRead> familyReads = safetyEducationVideoMapper.selectRead(page,pages);
        return familyReads;
    }

    @Override
    public List<TerraceInformationBean> selectTerraceInf(int page,int pages) {
        List<TerraceInformationBean> terraceInformationBeans = safetyEducationVideoMapper.selectTerraceInf(page,pages);
        return terraceInformationBeans;
    }

    @Override
    public boolean insTerraceInf(String iftcontent, String Createtime, String reserve1,String reserve3) {
        boolean b = safetyEducationVideoMapper.insTerraceInf(iftcontent,Createtime,reserve1,reserve3);
        return b;
    }

    @Override
    public boolean updateTerraceInf(String iftcontent, String Createtime, String reserve1, int ttid) {
        boolean b = safetyEducationVideoMapper.updateTerraceInf(iftcontent,Createtime,reserve1,ttid);
        return b;
    }

    @Override
    public boolean delectTerraceInf(int ttid) {
        boolean b = safetyEducationVideoMapper.delectTerraceInf(ttid);
        return b;
    }

    @Override
    public boolean updatereserve2(int ttid) {
        boolean b = safetyEducationVideoMapper.updatereserve2(ttid);
        return b;
    }

    @Override
    public List<TerraceInformationBean> selectType(String reserve3) {
        List<TerraceInformationBean> terraceInformationBeans = safetyEducationVideoMapper.selectType(reserve3);
        return terraceInformationBeans;
    }

    @Override
    public List<SafetyEducation> selectParentsVideo(int page, int pages) {
        List<SafetyEducation> safetyEducations = safetyEducationVideoMapper.selectParentsVideo(page, pages);
        return safetyEducations;
    }
}
