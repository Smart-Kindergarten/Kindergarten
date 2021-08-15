package com.cykj.service;

import com.cykj.bean.*;
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
     * 如
     * <video controls="autoplay"    src="http://localhost:9900/Security/GetVideo?mp4=TextMp4(1)" />
     */
    public void getVido(HttpServletRequest request, HttpServletResponse response, @RequestParam("mp4")String mp4);

    /**
     * 获取指定宝宝的接送记录
     * @param BID 宝贝id 必须传入的参数
     * @return 返回所有接送记录
     */
    public List<pick> GetPick(String BID);

    /**
     * 根据条件获取宝宝信息
     * @param Bname 宝宝名称 非必须参
     * @param CID 班级ID 非必须参
     * @return 返回符合条件的宝宝信息
     */
    public List<Baby> GetBaby(String Bname, String CID);

    /**
     * 根据条件获取宝宝班级
     * @param CName 班级名称 支持模糊查询 非必须参
     * @return  返回符合条件的所有班级列表
     */
    public List<BabyClass> GetBabyClass(String CName);

    /**
     * 获取所以警报日志
     * @return 返回所有警报日志
     */
    public List<Alertlog> getAlertlog(String minDate,String maxDate);

    /**
     * 获取院校基本信息
     * @return 返回院校基本信息 使用List类型防止报错
     */
    public List<KBean> getkdata();
    /**
     * 发送短信
     */
    public void alert(String serialize);
    /**
     * 获取个人信息
     */
    public List<SecurityGuardUserBen> getSecurityUser(String acc);
}
