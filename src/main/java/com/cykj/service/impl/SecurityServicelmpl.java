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
@Service
@Controller
@RequestMapping("/Security")
public class SecurityServicelmpl implements SecurityService {
    @Autowired
    private LoginMapper loginMapper;

    @RequestMapping("/Security_GetCarousel")
    @Override
    public ResponseEntity<byte[]> getLogo(@RequestParam("Carousel")String Carousel) {
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
    @ResponseBody
    @RequestMapping("/Security_GetMent")
    @Override
    public List<SecurityMenuVa> getMenu(@RequestParam("UserID")String UserID){
        System.out.println("123");
        List<Menu> Menus = loginMapper.menuAll(UserID);
        List<SecurityMenuVa> securityMenuVas = new ArrayList<SecurityMenuVa>();
        for(Menu menu : Menus){
            System.out.println(menu);
            SecurityMenuVa securityMenuVa = new SecurityMenuVa();
            if(menu.getMeid() == 0){
                securityMenuVa.setParentmenu(menu);
                for(Menu menu1:Menus){
                    if(menu1.getMeid() != 0 && menu1.getMeid() == menu.getMepid()){
                        securityMenuVa.getSubmenus().add(menu1);
                    }
                }
            }
            securityMenuVas.add(securityMenuVa);
        }
        System.out.println(securityMenuVas);
        return securityMenuVas;
    }

    /**
     *  视频流，但无法使用断点播放，只能使用线形播放（一次性播放到底无法拖动进度条已） 已废弃
     * @param request
     * @param response
     * @param mp4s
     */
//    @RequestMapping(value = "/preview2", method = RequestMethod.GET)
//    @ResponseBody
//    public void getPreview2(HttpServletResponse response,@RequestParam("mp4")String mp4) {
//        System.out.println("11");
//        try {
//            File file = new File(System.getProperty("user.dir")+"\\image\\mp4\\"+mp4+".mp4");
//            System.out.println(file);
//            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
//            response.setHeader("Content-Disposition", "attachment; filename="+file.getName());
//            InputStream iStream = new FileInputStream(file);
//            IOUtils.copy(iStream, response.getOutputStream());
//            response.flushBuffer();
//        } catch (java.nio.file.NoSuchFileException e) {
//            response.setStatus(HttpStatus.NOT_FOUND.value());
//        } catch (Exception e) {
//            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//        }
//    }

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
    @RequestMapping(value = "/GetVideo", method = RequestMethod.GET)
    @ResponseBody
    public void getVido(HttpServletRequest request, HttpServletResponse response,@RequestParam("mp4")String mp4) {
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
}
