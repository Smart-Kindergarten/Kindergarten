package com.cykj.controller;


import com.cykj.bean.Announcement;
import com.cykj.bean.BabyFood;
import com.cykj.bean.Healthbean;
import com.cykj.bean.SafetyEducation;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
import com.cykj.va.ChildHomeWork;
import com.cykj.va.CurrAndUser;
import com.google.gson.Gson;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
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
        return s;
    }


    /**
     * @Description: 小程序往期作业
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-09 11:28
     */
    @ResponseBody
    @GetMapping("/selOldHomeWork")
    public String selOldHomeWork(@RequestParam("page") int page, @RequestParam("uphone") String uphone) {
        List<ChildHomeWork> health = healthMapper.selOldHomeWork(uphone, (page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        return s;
    }


    /**
     * @Description: 查询校园公告信息
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-11 4:01
     */
    @ResponseBody
    @GetMapping("/selannouncement")
    public String selannouncement(@RequestParam("page") int page) {
        List<Announcement> health = healthMapper.selannouncement((page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        return s;
    }


    /**
     * @Description: 查看安全教育视频
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-12 1:07
     */
    @ResponseBody
    @GetMapping("/selVideo")
    public String selVideo(@RequestParam("page") int page) {
        List<SafetyEducation> health = healthMapper.selVideo((page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(health);
        return s;
    }



    /**
     * @Description: DataV数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-11 23:10
     */
    @ResponseBody
    @GetMapping("/dataV")
    public ArrayList<HashMap<String, String>> dataV() {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            HashMap<String, String> map = new HashMap<>();
            double f1 = Math.floor(Math.random() * 1000);
            double f2 = Math.floor(Math.random() * 1000);
            double f3 = Math.floor(Math.random() * 1000);
            double f4 = Math.floor(Math.random() * 1000);
            map.put("1", String.valueOf(f1));
            map.put("2", String.valueOf(f2));
            map.put("3", String.valueOf(f3));
            map.put("4", String.valueOf(f4));
            list.add(map);
        }
        return list;
    }

}
