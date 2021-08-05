package com.cykj.controller;

import com.cykj.utils.Parameter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/28 16:52
 * @desc: 上传作业
 */

@CrossOrigin
@RestController
public class UpHomework {
    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");

    @RequestMapping("/elUpload")
    public String elUpload(MultipartFile file) {
        System.out.println("-------上传作业-------");
        String fileName = file.getOriginalFilename();
        Parameter.setFileName(fileName);
        System.out.println(Parameter.getFileName());
        File dest = new File("D:\\Administrator\\Documents\\下载\\" + fileName);
        System.out.println(dest.getPath());
        Parameter.setPublishHomeworkPath(dest.getAbsolutePath());
        if (!dest.exists()) {
            dest.mkdirs();
        }
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败！";
    }

    @PostMapping("/upload")
    public Map<String, Object> fileUpload(MultipartFile file, HttpServletRequest req) {
        Map<String, Object> result = new HashMap<>();
        String originName = file.getOriginalFilename();
        System.out.println(originName);
        Parameter.setFileName(originName);
        String sub = originName.substring(originName.lastIndexOf("."));
        System.out.println(sub);
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String newName = UUID.randomUUID().toString() + sub;
        try {
            file.transferTo(new File(folder, originName));
            String url = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + format + "/" + originName;
            Parameter.setPublishHomeworkPath(url);
            result.put("status", "success");
            result.put("url", url);
        } catch (IOException e) {
            result.put("status", "error");
            result.put("msg", e.getMessage());
        }
        return result;
    }
}
