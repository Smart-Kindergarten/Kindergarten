package com.cykj.service.impl;

import com.cykj.bean.Menu;
import com.cykj.bean.User;
import com.cykj.mapper.LoginMapper;
import com.cykj.service.LoginService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: GGB
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/8
 */
@Service
@Controller
@RequestMapping("/admin")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @RequestMapping("/GGB")
    public String GGB(){
        System.out.println("后台进来了");
        return "Login";
    }


//    @PostMapping("/GGB2")
//    public @ResponseBody
//    String GGB2(User user){
//        System.out.println("后台进来了");
//        List<User> users = loginMapper.checkLogin(user);
//        System.out.println(users);
//        Gson gson = new Gson();
//        String s = gson.toJson(users);
//        return s;
//    }

    @Override
    public List<User> checkLogin(User user) {
        List<User> users = loginMapper.checkLogin(user);
        return users;
    }

    @Override
    public List<Menu> menuAll() {
        List<Menu> menus = loginMapper.menuAll();
        return menus;
    }
}
