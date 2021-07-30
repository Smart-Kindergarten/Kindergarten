package com.cykj.service.impl;

import com.cykj.bean.Menu;
import com.cykj.mapper.LoginMapper;
import com.cykj.service.SecurityService;
import com.cykj.va.SecurityMenuVa;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpUtils;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/23 22:23
 * @desc: 安保员端后端实现类
 */
public class SecurityServicelmpl implements SecurityService {
    @Autowired
    SecurityService securityService;

    public ResponseEntity<byte[]> getLogo(@RequestParam("Carousel")String Carousel) {
        return securityService.getLogo(Carousel);
    }

    @Override
    public List<SecurityMenuVa> getMenu(String UserID) {
        return null;
    }

    /**
     * 视频流
     * @param request Http输入流
     * @param response Http输出流
     * @param mp4 需要播放的视频名称
     * 前端请已此形式访问
     * <video controls="autoplay"    src="http://localhost:9900/Security/GetVideo?mp4=视频名（不带后缀）" />
     *
     * 如
     * <video controls="autoplay"    src="http://localhost:9900/Security/GetVideo?mp4=TextMp4(1)" />
     */
    public void getVido(HttpServletRequest request, HttpServletResponse response,@RequestParam("mp4")String mp4) {
        securityService.getVido(request,response,mp4);
    }
}
