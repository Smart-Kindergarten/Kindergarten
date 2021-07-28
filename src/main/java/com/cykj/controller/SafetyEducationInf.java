package com.cykj.controller;

import com.cykj.bean.Healthbean;
import com.cykj.bean.SafetyEducation;
import com.cykj.mapper.SafetyEducationVideoMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: 获取安全教育视频信息
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/27
 */
@Controller
@RequestMapping("/SafetyEducationInf")
public class SafetyEducationInf {

    @Autowired
    private SafetyEducationVideoMapper safetyEducationVideoMapper;

    @GetMapping("/SafetyAll")
    public @ResponseBody
    String GGB2(int page,String uaccount){
        System.out.println("安全教育视频信息进来了");
        System.out.println(page);
        List<SafetyEducation> safetyEducations = safetyEducationVideoMapper.selectAll((page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(safetyEducations);
        System.out.println(s);
        return s;
    }
}
