package com.cykj.controller;

import com.cykj.bean.pick;
import com.cykj.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/31 2:55
 * @desc:
 */
@Controller
@RequestMapping("/Security")
public class Securitycl {
    @Autowired
    SecurityService securityService;
    @RequestMapping("/getLogo")
    public ResponseEntity<byte[]> getLogo(@RequestParam("Carousel")String Carousel) {
        return securityService.getLogo(Carousel);
    }
    @RequestMapping(value = "/GetVideo", method = RequestMethod.GET)
    @ResponseBody
    public void getVido(HttpServletRequest request, HttpServletResponse response, @RequestParam("mp4")String mp4) {
        securityService.getVido(request,response,mp4);
    }
    @ResponseBody
    @RequestMapping("/GetPick")
    public List<pick> getpick(@RequestParam("BID") String BID){
        return securityService.GetPick(BID);
    }
}
