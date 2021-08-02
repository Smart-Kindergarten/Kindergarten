package com.cykj.controller;

import com.cykj.utils.Parameter;
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
 * @desc: 上传作业
 */

@CrossOrigin
@RestController
public class UpHomework {

    @RequestMapping("/elUpload")
    public String elUpload(MultipartFile file) {
        System.out.println("-------上传作业-------");
        String fileName = file.getOriginalFilename();
        Parameter.setFileName(fileName);
        System.out.println(Parameter.getFileName());
        File dest = new File("D:\\Administrator\\Documents\\下载\\" + fileName);
        System.out.println(dest.getPath());
        Parameter.setPublishHomeworkPath(dest.getAbsolutePath());
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败！";
    }


}
