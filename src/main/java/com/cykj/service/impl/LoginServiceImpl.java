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
    public String GGB() {
        System.out.println("后台进来了");
        return "Login";
    }


    @Override
    public List<User> checkLogin(User user) {
        List<User> users = loginMapper.checkLogin(user);
        return users;
    }

    @Override
    public List<Menu> menuAll(String account) {
        List<Menu> menus = loginMapper.menuAll(account);
        return menus;
    }

    /**
     * @Description: 小程序登录
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-26 14:10
     */
    @Override
    public List<User> xcxLogin(User user) {
        return loginMapper.xcxLogin(user);
    }

    /**
     * @Description: 小程序修改密码
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-26 16:00
     */
    @Override
    public Boolean updatePwd(String upwd, String uphone) {
        return loginMapper.updatePwd(upwd, uphone);
    }


    /**
     * @Description: 查询账号是否存在
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-14 9:36
     */
    @Override
    public List<User> existUacc(String uaccount) {
        return loginMapper.existUacc(uaccount);
    }


    /**
     * @Description: PC端修改密码
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-14 8:40
     */
    @Override
    public Boolean updPcPwd(String upwd, String uaccount) {
        return loginMapper.updPcPwd(upwd, uaccount);
    }


}
