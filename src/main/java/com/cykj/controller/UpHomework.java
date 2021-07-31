package com.cykj.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/28 16:52
 * @desc:
 */

@CrossOrigin
@RestController
public class UpHomework {

    @RequestMapping("/elUpload")
    public String elUpload(MultipartFile file) {
        System.out.println("-------上传作业-------");
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        File dest = new File("D:\\Administrator\\Documents\\下载\\" + fileName);
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败！";
    }

    @RequestMapping("/upHomework")
    public String upHomework() {
        System.out.println("-------发布作业-------");
        return null;
    }

}
