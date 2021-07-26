package com.cykj.controller;

import com.cykj.bean.Menu;
import com.cykj.bean.User;
import com.cykj.mapper.LoginMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * @ClassName: Hello
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/12
 */
@Controller
@RequestMapping("/Security")
public class Security {

    @Resource
    private HttpServletResponse response;

    @GetMapping(value = "/getCarousel")
    public void getImage(String Carousel) throws IOException {
        OutputStream os = null;
        try {
//        读取图片
            BufferedImage image = ImageIO.read(new FileInputStream(new File(System.getProperty("user.dir")+"/image/Carousel"+Carousel)));
            response.setContentType("image/jpeg");
            os = response.getOutputStream();

            if (image != null) {
                ImageIO.write(image, "jpeg", os);
            }
        } catch (IOException e) {
            System.err.println("获取图片异常{}");
        } finally {
            if (os != null) {
                os.flush();
                os.close();
            }
        }
    }

}
