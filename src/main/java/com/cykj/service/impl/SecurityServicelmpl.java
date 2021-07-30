package com.cykj.service.impl;

import com.cykj.bean.Menu;
import com.cykj.bean.pick;
import com.cykj.mapper.LoginMapper;
import com.cykj.mapper.PickMapper;
import com.cykj.service.SecurityService;
import com.cykj.va.SecurityMenuVa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
@Service
public class SecurityServicelmpl implements SecurityService {
    @Autowired
    private PickMapper pickMapper;
    public ResponseEntity<byte[]> getLogo(String Carousel) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] bytesByStream = new byte[3072];
        try {
            InputStream inputStream = new DataInputStream(new FileInputStream(new File(System.getProperty("user.dir")+"/image/Carousel/jpeg"+Carousel+".jpeg")));
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
    public void getVido(HttpServletRequest request, HttpServletResponse response,String mp4) {
        String file = System.getProperty("user.dir")+"\\image\\mp4\\"+mp4+".mp4";
        try {
            FileInputStream inputStream = new FileInputStream(file);
            byte[] data = new byte[inputStream.available()];
            inputStream.read(data);
            String diskfilename = "final.mp4";
            response.setContentType("video/mp4");
            response.setHeader("Content-Disposition", "attachment; filename=\"" + diskfilename + "\"");
            response.setContentLength(data.length);
            response.setHeader("Content-Range", "" + Integer.valueOf(data.length - 1));
            response.setHeader("Accept-Ranges", "bytes");
            response.setHeader("Etag", "W/\"9767057-1323779115364\"");
            OutputStream os = response.getOutputStream();
            os.write(data);
            //先声明的流后关掉！
            os.flush();
            os.close();
            inputStream.close();

        } catch (Exception e) {

        }
    }

    @Override
    public List<pick> GetPick(String BID) {
        List<pick> picks = pickMapper.GetPick(BID);

        return null;
    }

}
