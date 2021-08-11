package com.cykj.controller;

import com.cykj.bean.CheckHomework;
import com.cykj.bean.FamilyRead;
import com.cykj.service.HealthService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

/**
 * @ClassName: UploadFile
 * @Description: 上传文件
 * @Author: BWL
 * @Date: 2021/7/25
 */

@RestController
@Slf4j
public class UploadFile {

    Gson gson = new Gson();
    String flag = "";

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
        file.transferTo(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\static\\js\\publishHomework\\" + fileNames));
        String a = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\js\\publishHomework\\" + fileNames;
        System.out.println("bhkbbbbbbbbbbb" + a);
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
        String URL = checkHomework.getHomeworkURL();
        String[] split = URL.split("\\\\");
//        System.out.println(split.length);
        System.out.println(split[split.length - 1]);
        checkHomework.setWorkName(split[split.length - 1]);
        Boolean health = healthService.insertHomeWork(checkHomework);
        if (health) {
            flag = "文件上传成功";
        } else {
            flag = "文件上传失败";
        }
        return flag;
    }


    /**
     * @return
     * @Description: 安全教育答题存成绩于数据库
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-09 10:23
     */
    @ResponseBody
    @RequestMapping("/insertAnswer")
    public String insertAnswer(String secScore, String videoId) {
        System.out.println("存成绩了");
        System.out.println(secScore);
        System.out.println(videoId);
        Boolean cj = healthService.insertAnswer(secScore, videoId);
        if (cj) {
            flag = "成绩存入成功";
        } else {
            flag = "成绩存入失败";
        }
        return flag;
    }


    /**
     * @Description: 查看绘本信息
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-10 3:58
     */
    @ResponseBody
    @GetMapping("/selHuiben")
    public String selHuiben(@RequestParam("page") int page) {
        System.out.println("查询绘本了");
        List<FamilyRead> hb = healthService.selHuiben((page - 1) * 5, page * 5);
        String s = gson.toJson(hb);
        System.out.println(s);
        return s;
    }

}
