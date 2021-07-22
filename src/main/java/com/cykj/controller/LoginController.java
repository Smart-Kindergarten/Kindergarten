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

//    @ResponseBody
    @RequestMapping("/dududdu")
    public String hh(){
        return "loginController";
    }

    @GetMapping("/GGB2")
    public @ResponseBody String GGB2(User user){
        System.out.println(user.getUaccount());
        System.out.println(user.getUpwd());
        System.out.println("后台进来了");
        List<User> users = loginMapper.checkLogin(user);
//        System.out.println(users);
//        System.out.println(name);
//        System.out.println(pwd);
//        User user = new User();
//        user.setName(name);
//        user.setPwd(pwd);
        System.out.println(users.toString()+"dasdads");
        Gson gson = new Gson();
        String s = gson.toJson(users);
        return s;
    }

    @GetMapping("/MenuAll")
    public @ResponseBody String GGB2(){
        System.out.println("菜单进来了");
        List<Menu> menus = loginMapper.menuAll("100");
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
}
