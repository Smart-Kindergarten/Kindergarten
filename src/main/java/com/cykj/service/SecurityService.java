package com.cykj.service;

import com.cykj.bean.Menu;
import com.cykj.va.SecurityMenuVa;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/23 17:26
 * @desc: 安保端后端接口
 */
@Service
public interface SecurityService {
    /**
     * 获取安保首页LOGO图 image 文件夹后缀 1234
     * @Carousel 图片后缀 1-2-3-4
     * getLogo(1);
     */
    public ResponseEntity<byte[]> getLogo(String Carousel);
    /**
     * 获取安保员菜单
     * 获得List<SecurityMenuVa></>数据类型菜单
     * SecurityMenuVa.Parentmenu 为父菜单数据
     * SecurityMenuVa.Submenu 为此父菜单的子菜单数据
     */
    public List<SecurityMenuVa> getMenu(String UserID);
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
    public void getVido(HttpServletRequest request, HttpServletResponse response, @RequestParam("mp4")String mp4);
}
