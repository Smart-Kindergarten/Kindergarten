package com.cykj.controller;


import com.cykj.bean.BabyFood;
import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
import com.cykj.va.ChildHomeWork;
import com.cykj.va.CurrAndUser;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: ZW
 * @Date: 2021/7/25
 */
@Controller
@RequestMapping("/Health")
public class Health extends HttpServlet {

    @Autowired
    private HealthService healthService;
    @Autowired
    private HealthMapper healthMapper;

    @GetMapping("/HealthAll")
    public @ResponseBody
    String GGB2(int page, String uaccount, HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("保健信息进来了");
        System.out.println(page);
        String uaccounts = (String) req.getSession().getAttribute("uaccount");
        System.out.println(uaccount);
        System.out.println(uaccounts);
        List<Healthbean> health = healthMapper.selectHealth(uaccounts, (page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        System.out.println(s);
        return s;
    }


    /**
     * @Description: 小程序幼儿保健
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-28 15:34
     */
    @ResponseBody
    @GetMapping("/selHeaUphone")
    public String selHeaUphone(@RequestParam("page") int page, @RequestParam("uphone") String uphone) {
        System.out.println("手机保健信息进来了");
        System.out.println(page);
        System.out.println(uphone);
        List<Healthbean> health = healthMapper.selHeaUphone(uphone, (page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        System.out.println(s);
        return s;
    }


    /**
     * @Description: 小程序根据手机查询宝宝课程表数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 2:00
     */
    @ResponseBody
    @GetMapping("/selCurrAndUser")
    public String selCurrAndUser(@RequestParam("page") int page, @RequestParam("uphone") String uphone) {
        List<CurrAndUser> health = healthMapper.selCurrAndUser(uphone, (page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        System.out.println(s);
        return s;
    }


    /**
     * @Description: 小程序查询宝宝膳食数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 3:23
     */
    @ResponseBody
    @GetMapping("/selBabyFood")
    public String selBabyFood(@RequestParam("page") int page) {
        List<BabyFood> health = healthMapper.selBabyFood((page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        System.out.println(s);
        return s;
    }


    /**
     * @Description: 小程序亲子作业
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 5:50
     */
    @ResponseBody
    @GetMapping("/selChildHomeWork")
    public String selChildHomeWork(@RequestParam("page") int page, @RequestParam("uphone") String uphone) {
        List<ChildHomeWork> health = healthMapper.selChildHomeWork(uphone, (page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        System.out.println(s);
        return s;
    }

}
