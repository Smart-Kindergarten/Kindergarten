package com.cykj.service;

import com.cykj.bean.Menu;
import com.cykj.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: LoginService
 * @Description:
 * @Author: ZW
 * @Date: 2021/6/2
 */
@Service
public interface LoginService {
    List<User> checkLogin(User user);

    // 菜单
    List<Menu> menuAll(@Param("account")String account);

    //小程序登录
    List<User> xcxLogin(User user);

    //小程序修改密码
    Boolean updatePwd(@Param("upwd") String upwd, @Param("uphone") String uphone);

    //查询账号是否存在
    List<User> existUacc(@Param("uaccount") String uaccount);

    //PC修改密码
    Boolean updPcPwd(@Param("upwd") String upwd, @Param("uaccount") String uaccount);
}
