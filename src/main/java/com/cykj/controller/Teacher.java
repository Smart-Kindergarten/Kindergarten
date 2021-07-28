package com.cykj.controller;

import com.cykj.bean.Curriculum;
import com.cykj.service.impl.CurriculumServiceImpl;
import com.cykj.utils.WeekDate;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/26 9:55
 * @desc:
 */

@Controller
@RequestMapping("/teacher")
public class Teacher {
    @Autowired
    private CurriculumServiceImpl curriculumService;

    //查询当前日期课程表
    @RequestMapping("/selectCurrAll")
    @ResponseBody
    public String getCurrAll(String date) {
        System.out.println("-------查询课程表-------");
        String monday = WeekDate.getMonday(date);
        System.out.println(date + "这周的第一天：" + monday);
        List<Curriculum> currAll = curriculumService.selectCurrAll(monday);
        Gson gson = new Gson();
        String s = gson.toJson(currAll);
        System.out.println(s);
        return s;
    }

    //查询当前日期的上周或下周课程表
    @ResponseBody
    @RequestMapping("/getWeekDate")
    public String getWeekCurrAll(String week) {
        System.out.println("-------查询课程表-------");
        String date = WeekDate.getDate(week);//获取到日期的上周或下周
        String monday = WeekDate.getMonday(date);//获取到上周或下周的第一天（星期一为一周开始）
        System.out.println("日期：" + monday);
        List<Curriculum> currAll = curriculumService.selectCurrAll(monday);
        Gson gson = new Gson();
        String s = gson.toJson(currAll);
        System.out.println(s);
        return s;
    }

    @ResponseBody
    @RequestMapping("/publishHomework")
    public void getPublishHomework() {
        System.out.println("-------发布作业-------");
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/upHomework")
    public String upHomework(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        System.out.println("-------上传作业-------");
        request.setCharacterEncoding("UTF-8");
        String user = request.getParameter("user");

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

                    // 设置存放图片文件的路径
                    path = "/workplace/classwork/" + trueFileName;
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

}
