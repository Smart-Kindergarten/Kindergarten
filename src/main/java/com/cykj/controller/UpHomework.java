package com.cykj.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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

    @PostMapping(value = "/upHomework")
    public String upHomework(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        System.out.println("-------上传作业-------");
        request.setCharacterEncoding("UTF-8");
        String user = request.getParameter("user");
        System.out.println(file);
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            String path = null;
            String type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            if (type != null) {
                if ("DOCX".equals(type.toUpperCase()) || "DOC".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
                    String realPath = request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName = user + "_" + fileName;
//                    String trueFileName = fileName;

                    // 设置存放图片文件的路径
                    path = "D:\\Administrator\\Documents\\下载\\" + trueFileName;
                    File dest = new File(path);
                    //判断文件父目录是否存在
                    if (!dest.getParentFile().exists()) {
                        dest.getParentFile().mkdir();
                    }

                    file.transferTo(dest);

                    return trueFileName;
                } else {
                    return "error";
                }
            } else {
                return "error";
            }
        } else {
            return "error";
        }

    }

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

}
