package com.cykj.service.impl;

import com.cykj.bean.SafetyEducation;
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
    public boolean inseVideo(String videoName, String releaseTime, String fileSite) {
        boolean b = safetyEducationVideoMapper.inseVideo(videoName,releaseTime,fileSite);
        return b;
    }
}
