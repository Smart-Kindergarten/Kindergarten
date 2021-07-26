package com.cykj.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;

/**
 * @ClassName: UploadFile
 * @Description: 上传
 * @Author: BWL
 * @Date: 2021/7/25
 */

@RestController
public class UploadFile {

    @ResponseBody
    @RequestMapping("/upload")
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file) throws Exception {
        System.out.println("接收到文件");
        LocalDate today = LocalDate.now();
        Instant timestamp = Instant.now();
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        String fileNames = today + String.valueOf(timestamp.toEpochMilli()) + "." + ext;
        //保存到文件服务器
        file.transferTo(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\static\\js\\" + fileNames));
        return "上传文件成功";
    }
}
