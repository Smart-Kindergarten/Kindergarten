package com.cykj.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

/**
 * @ClassName: UploadFile
 * @Description: 上传文件
 * @Author: BWL
 * @Date: 2021/7/25
 */

@RestController
@Slf4j
public class UploadFile {

    /**
     * @Description: 上传文件
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-30 4:57
     */
    @ResponseBody
    @RequestMapping("/upload")
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file) throws Exception {
        System.out.println("接收到文件");
        LocalDate today = LocalDate.now();
        Instant timestamp = Instant.now();
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        String fileNames = today + String.valueOf(timestamp.toEpochMilli()) + "." + ext;
        //保存到文件服务器
        file.transferTo(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\static\\fileImage\\" + fileNames));
        return "上传文件成功";
    }





}
