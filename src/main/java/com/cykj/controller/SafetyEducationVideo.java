package com.cykj.controller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

import com.cykj.mapper.HealthMapper;
import com.cykj.mapper.SafetyEducationVideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
/**
 * @ClassName: SafetyEducationVideo
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/27
 */

import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class SafetyEducationVideo {


    @Autowired
    private SafetyEducationVideoMapper safetyEducationVideoMapper;
    //实现接收的方法
    @CrossOrigin
    @PostMapping(value = "/uploadVidoe3")
    @ResponseBody
    public Map<String,String> savaVideotest(@RequestParam("file") MultipartFile file,@RequestParam String SavePath,@RequestParam String prop)
            throws IllegalStateException {

        System.out.println("前台视频id"+prop);

        Map<String,String> resultMap = new HashMap<>();
        System.out.println("视频进来了");
        try{
            //获取文件后缀，因此此后端代码可接收一切文件，上传格式前端限定
            String fileExt = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1)
                    .toLowerCase();
            File directory = new File("src/main/resources");
            String courseFile = directory.getCanonicalPath()+"/static/js/video/";;
            System.out.println(courseFile);
            // 重构文件名称
            System.out.println("前端传递的保存路径："+courseFile);
            String pikId = file.getOriginalFilename();
//            String pikId = UUID.randzomUUID().toString().replaceAll("-", "");
            String newVidoeName = pikId;
//            String newVidoeName = pikId + "." + fileExt;
            System.out.println("重构文件名防止上传同名文件："+newVidoeName);
            //保存视频
            File fileSave = new File(courseFile, newVidoeName);
            file.transferTo(fileSave);
            //构造Map将视频信息返回给前端
            //视频名称重构后的名称
            resultMap.put("newVidoeName",newVidoeName);
            //正确保存视频则设置返回码为200
            resultMap.put("resCode","200");
            //返回视频保存路径
            resultMap.put("VideoUrl",courseFile + "/" + newVidoeName);
            System.out.println(newVidoeName.charAt(4));
            String[] splitAddress=newVidoeName.split("\\."); //如果以竖线为分隔符，则split的时候需要加上两个斜杠【\\】进行转义
            System.out.println(splitAddress.length);
            System.out.println("切割"+splitAddress[0]);
            System.out.println("切割"+splitAddress[1]);
            // 获取系统时间
//            asd
            Date    now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String hehe = dateFormat.format( now );
            if (!prop.equals("null")){
                // 修改
                boolean b = safetyEducationVideoMapper.updateVideo(splitAddress[0], hehe,newVidoeName ,Integer.valueOf(prop));
            }else{
                // 插入
                boolean b = safetyEducationVideoMapper.inseVideo(splitAddress[0],hehe,newVidoeName,courseFile + "/" + newVidoeName);
                if (b){
                    System.out.println("视频插入成功");
                }else{
                    System.out.println("视频插入失败");
                }
            }
            return  resultMap;

        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            //保存视频错误则设置返回码为400
            resultMap.put("resCode","400");
            return  resultMap ;

        }
    }
}
