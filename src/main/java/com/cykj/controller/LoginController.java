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

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.util.List;

/**
 * @ClassName: Hello
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/12
 */
@Controller
@RequestMapping("/admin")
public class LoginController extends HttpServlet {
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
    String GGB2(User user, HttpServletRequest req, HttpServletResponse resp) {
        String uaccount = user.getUaccount();
        String upwd = user.getUpwd();
        HttpSession session = req.getSession();
        session.setAttribute("uaccount",uaccount);
        session.setAttribute("upwd",upwd);
        session.setAttribute("user",user);
        List<User> users = loginMapper.checkLogin(user);
        System.out.println(users.toString() + "dasdads");
        Gson gson = new Gson();
        String s = gson.toJson(users);
        return s;
    }

    @GetMapping("/MenuAll")
    public @ResponseBody
    String GGB2(String uaccount, HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("菜单进来了阿阿");
        System.out.println("uaccount:" + uaccount);
        String uaccounts = (String) req.getSession().getAttribute("uaccount");
        System.out.println(uaccounts);
        List<Menu> menus = loginMapper.menuAll(uaccounts);
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

    /**
     * @Description: 小程序修改密码
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-27 10:29
     */
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


    /**
     * @Description: 查询账号是否存在
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-14 9:36
     */
    @ResponseBody
    @RequestMapping("/existUacc")
    public List<User> existUacc(String uaccount) {
        System.out.println(uaccount);
        List<User> flags = loginMapper.existUacc(uaccount);
        return flags;
    }



    /**
     * @Description: PC端修改密码
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-14 8:40
     */
    @ResponseBody
    @RequestMapping("/updPcPwd")
    public Boolean updPcPwd(String upwd, String uaccount) {
        System.out.println(upwd);
        System.out.println(uaccount);
        Boolean flags = loginMapper.updPcPwd(upwd, uaccount);
        if (flags) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

}
