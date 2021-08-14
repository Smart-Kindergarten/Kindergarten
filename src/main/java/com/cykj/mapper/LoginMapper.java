package com.cykj.mapper;


import com.cykj.bean.Menu;
import com.cykj.bean.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface LoginMapper {
    // 登录
    List<User> checkLogin(User user);

    // 菜单
    List<Menu> menuAll(@Param("account") String account);

    //小程序登录
    List<User> xcxLogin(User user);

    //小程序修改密码
    Boolean updatePwd(@Param("upwd") String upwd, @Param("uphone") String uphone);

    //查询账号是否存在
    List<User> existUacc(@Param("uaccount") String uaccount);

    //PC修改密码
    Boolean updPcPwd(@Param("upwd") String upwd, @Param("uaccount") String uaccount);

}
