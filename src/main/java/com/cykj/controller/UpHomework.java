package com.cykj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/28 16:52
 * @desc:
 */
@Controller
public class UpHomework {

    @CrossOrigin
    @ResponseBody
    @PostMapping(value ="/upHomework")
    public String upHomework() {
        System.out.println("-------上传作业-------");
        return null;
    }
}
