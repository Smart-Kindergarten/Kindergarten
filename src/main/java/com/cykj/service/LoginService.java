package com.cykj.service;

import com.cykj.bean.Menu;
import com.cykj.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: LoginService
 * @Description:
 * @Author: ZW
 * @Date: 2021/6/2
 */
public interface LoginService {
    List<User> checkLogin(User user);

    // 菜单
    List<Menu> menuAll(@Param("account")String account);
}
