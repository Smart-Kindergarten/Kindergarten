package com.cykj.controller;

import com.cykj.bean.CheckHomework;
import com.cykj.bean.Healthbean;
import com.cykj.service.HealthService;
import com.cykj.va.ChildHomeWork;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UploadFile
 * @Description: 上传文件
 * @Author: BWL
 * @Date: 2021/7/25
 */

@RestController
@Slf4j
@SessionAttributes("a")
public class UploadFile {

    Gson gson = new Gson();

    @Autowired
    private HealthService healthService;

    /**
     * @Description: 上传文件
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-30 4:57
     */
    @ResponseBody
    @RequestMapping("/uploads")
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file) throws Exception {
        System.out.println("接收到文件");
        LocalDate today = LocalDate.now();
        Instant timestamp = Instant.now();
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        String fileNames = today + String.valueOf(timestamp.toEpochMilli()) + "." + ext;
        //保存到文件服务器
        file.transferTo(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\static\\fileImage\\" + fileNames));
        String a =  System.getProperty("user.dir") + "\\src\\main\\resources\\static\\fileImage\\" + fileNames;
        System.out.println("bhkbbbbbbbbbbb"+a);
        return a;
    }


    /**
     * @Description: word文件存数据库
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-07 5:09
     */
    @ResponseBody
    @RequestMapping("/insertHomeWorksa")
    public String insertHomeWork(CheckHomework checkHomework) {
        System.out.println("提交作业");
        System.out.println(checkHomework);
        System.out.println(checkHomework.getPhId());
        System.out.println(checkHomework.getHomeworkURL());
        // 一下
//        List<CheckHomework> health = healthService.insertHomeWork();
//        Gson gson = new Gson();
//        String s = gson.toJson(health);
//        System.out.println(s);
        return null;
    }


}
