package com.cykj.service;

import com.cykj.bean.Menu;
import com.cykj.bean.User;

import java.util.List;

/**
 * @ClassName: LoginService
 * @Description:
 * @Author: ZW
 * @Date: 2021/6/2
 */
public interface LoginService {
    List<User> checkLogin(User user);

    List<Menu> menuAll();
}
