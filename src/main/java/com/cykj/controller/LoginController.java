package com.cykj.controller;

import com.cykj.bean.Menu;
import com.cykj.bean.User;
import com.cykj.mapper.LoginMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: Hello
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/12
 */
@Controller
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private LoginMapper loginMapper;

    boolean flag = false;

    //    @ResponseBody
    @RequestMapping("/dududdu")
    public String hh() {
        return "loginController";
    }

    @GetMapping("/GGB2")
    public @ResponseBody
    String GGB2(User user) {
        System.out.println(user.getUaccount());
        System.out.println(user.getUpwd());
        System.out.println("后台进来了");
        List<User> users = loginMapper.checkLogin(user);
//        System.out.println(users);
//        System.out.println(name);
//        System.out.println(pwd);
//        User user = new User();急急急
//        user.setName(name);
//        user.setPwd(pwd);
        System.out.println(users.toString() + "dasdads");
        Gson gson = new Gson();
        String s = gson.toJson(users);
        return s;
    }

    @GetMapping("/MenuAll")
    public @ResponseBody
    String GGB2(String uaccount) {
        System.out.println("菜单进来了阿阿");
        System.out.println("uaccount:" + uaccount);
        List<Menu> menus = loginMapper.menuAll(uaccount);
//        System.out.println(users);
//        System.out.println(name);
//        System.out.println(pwd);
//        User user = new User();
//        user.setName(name);
//        user.setPwd(pwd);
        System.out.println(menus.toString());
        Gson gson = new Gson();
        String s = gson.toJson(menus);
        return s;
    }

    /**
     * @Description: 小程序登录
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-26 11:06
     */
    @ResponseBody
    @RequestMapping("/xcxLogin")
    public String xcxLogin(User user) {
        System.out.println(user.getUphone());
        System.out.println(user.getUpwd());
        List<User> users = loginMapper.xcxLogin(user);
        System.out.println(users.toString() + "dasdads");
        Gson gson = new Gson();
        String loginlist = gson.toJson(users);
        return loginlist;
    }

    @ResponseBody
    @RequestMapping("/updatePwd")
    public Boolean updatePwd(String upwd, String uphone) {
        System.out.println(upwd);
        System.out.println(uphone);
        Boolean flags = loginMapper.updatePwd(upwd, uphone);
        if (flags) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

}
