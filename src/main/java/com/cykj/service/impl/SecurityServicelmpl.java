package com.cykj.service.impl;

import com.cykj.service.SecurityService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpUtils;
import java.io.*;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/23 22:23
 * @desc:
 */
@Service
@Controller
@RequestMapping("/Security")
public class SecurityServicelmpl implements SecurityService {
    @RequestMapping("/GetCarousel")
    @Override
    public ResponseEntity<byte[]> getLogo(String Carousel) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] bytesByStream = new byte[3072];
        try {
            InputStream inputStream = new DataInputStream(new FileInputStream(new File(System.getProperty("user.dir")+"/image/Carousel"+Carousel+".jpeg")));
            int b;
            byteArrayOutputStream = new ByteArrayOutputStream();
            while((b = inputStream.read(bytesByStream)) != -1){

                byteArrayOutputStream.write(bytesByStream,0,b);
            }
        } catch (IOException e) {
            System.out.println("无此图片");
        }
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        return new ResponseEntity<>(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }
}
