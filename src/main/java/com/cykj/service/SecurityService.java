package com.cykj.service;

import com.cykj.bean.Menu;
import com.cykj.va.SecurityMenuVa;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
}
