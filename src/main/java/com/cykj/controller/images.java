package com.cykj.controller;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URISyntaxException;

/**
 * @ClassName: images
 * @Description:
 * @Author: ZW
 * @Date: 2021/8/5
 */
@Controller
public class images {
    @RequestMapping("/addImage")
    @ResponseBody
        public String addImage(HttpServletRequest req, HttpServletResponse resp,@RequestParam String name, @RequestParam(name = "image_data", required = false) MultipartFile file) {
        System.out.println("绘本图片进来了");
        // 这里都不进来了   刚刚是页面上有个lengsh报错  未定义
        //文件上传
        if (!file.isEmpty()) {
            try {

                File directory = new File("src/main/resources");
                String courseFile = directory.getCanonicalPath()+ "/static/js/images/";;
                System.out.println(courseFile);

                System.out.println(name);
                System.out.println("qwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
                //图片命名
                String newCompanyImageName = name;
                String newCompanyImageNames = newCompanyImageName+".jpg";
                String newCompanyImagepath = courseFile+newCompanyImageNames;

                HttpSession session = req.getSession();
                session.setAttribute("newCompanyImageName",newCompanyImageName);

                File newFile = new File(newCompanyImagepath);
                if (!newFile.exists()) {
                    newFile.createNewFile();
                }
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(newFile));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "图片上传失败！";
            } catch (IOException e) {
                e.printStackTrace();
                return "图片上传失败！";
            }
        }
        return "图片上传失败！";
    }





}
