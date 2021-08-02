package com.cykj.controller;

import com.cykj.bean.FamilyRead;
import com.cykj.bean.Healthbean;
import com.cykj.bean.SafetyEducation;
import com.cykj.bean.TerraceInformationBean;
import com.cykj.mapper.SafetyEducationVideoMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
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


    @GetMapping("/delectVideo")
    public @ResponseBody
    String GGB2(String voids){
        System.out.println("删除视频");
        boolean b = safetyEducationVideoMapper.delectVideo(voids);
        if (b){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        Gson gson = new Gson();
        String s = gson.toJson(b);
        System.out.println(s);
        return s;
    }

    @GetMapping("/readInf")
    public @ResponseBody
    String readInf(int page){
        System.out.println("获取绘本信息");
        List<FamilyRead> familyReads = safetyEducationVideoMapper.selectRead((page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(familyReads);
        System.out.println(s);
        return s;
    }



    @GetMapping("/TerraceInf")
    public @ResponseBody
    String TerraceInf(int page){
        System.out.println("获取平台信息");
        List<TerraceInformationBean> terraceInformationBeans = safetyEducationVideoMapper.selectTerraceInf((page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(terraceInformationBeans);
        System.out.println(s);
        return s;
    }


    // 新增资讯
    @GetMapping("/addTerraceInf")
    public @ResponseBody
    String TerraceInf(String ttid,String iftcontent){
        System.out.println("新增资讯");
        System.out.println("ttid"+ttid);
        System.out.println("iftcontent"+iftcontent);
        // 获取系统时间
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String hehe = dateFormat.format( now );
        boolean b = safetyEducationVideoMapper.insTerraceInf(ttid, iftcontent, hehe);
        if (b){
            System.out.println("新增资讯成功");
        }
        return "200";
    }
}
