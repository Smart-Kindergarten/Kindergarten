package com.cykj.controller;

import com.cykj.bean.BabyInf;
import com.cykj.bean.Healthbean;
import com.cykj.bean.User;
import com.cykj.mapper.HealthMapper;
import com.cykj.mapper.TerraceMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: Terrace
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/26
 */
@Controller
@RequestMapping("/Terrace")
public class Terrace {
    @Autowired
    private TerraceMapper terraceMapper;

    @GetMapping("/PatriarchAll")
    public @ResponseBody
    String GGB2(String biadtime,String biadtimes,String uname,int page) {
        System.out.println("家长管理进来了");
        System.out.println(biadtime);
        System.out.println(biadtimes);
        System.out.println(uname);
        System.out.println(page);
        List<User> users = terraceMapper.selectPatriarch(biadtime,biadtimes,uname,(page - 1) * 5,  5);
        Gson gson = new Gson();
        String s = gson.toJson(users);
        System.out.println(s);
        return s;
    }

    @GetMapping("/delect")
    public @ResponseBody
    String delect(String uaccount) {
        System.out.println("删除进来了");
        System.out.println(uaccount);
        boolean b = terraceMapper.delectPatriarch(uaccount);
        Gson gson = new Gson();
        String s = null;
        if (b) {
            s = gson.toJson("200");
            System.out.println("删除成功");
        } else {
            s = gson.toJson("100");
            System.out.println("删除失败");
        }
        System.out.println(s);
        return s;
    }

    // 修改状态
    @GetMapping("/updateState")
    public @ResponseBody
    String delect(String ustate, String uaccount) {
        System.out.println("修改状态进来了");
        System.out.println(uaccount);
        System.out.println(ustate);
        boolean b = false;
        if (ustate.equals("启用")) {
            b = terraceMapper.updateState("7", uaccount);
        } else {
            b = terraceMapper.updateState("8", uaccount);
        }

        Gson gson = new Gson();
        String s = null;
        if (b) {
            s = gson.toJson("200");
            System.out.println("修改成功");
        } else {
            s = gson.toJson("100");
            System.out.println("修改失败");
        }
        System.out.println(s);
        return s;
    }


    @GetMapping("/affirmClick")
    public @ResponseBody
    String affirmClick(String uname, String uwork, String usite, String uphone, String uchildrelation, String uaccount) {
        System.out.println("确认修改进来了");
        System.out.println(uname);
        System.out.println(uwork);
        System.out.println(usite);
        System.out.println(uphone);
        System.out.println(uchildrelation);
        System.out.println(uaccount);
        boolean b = terraceMapper.affirmClick(uname, uwork, usite, uphone, uchildrelation, uaccount);
        Gson gson = new Gson();
        String s = null;
        if (b) {
            s = gson.toJson("200");
        } else {
            s = gson.toJson("100");
        }
        return s;
    }

    // 新增家长
    @GetMapping("/affirmAdd")
    public @ResponseBody
    String affirmAdd(String uaccount, String uname, String uwork, String usite, String uphone, String uchildrelation) {
        System.out.println("新增进来了");
        System.out.println(uaccount);
        System.out.println(uname);
        System.out.println(uwork);
        System.out.println(usite);
        System.out.println(uphone);
        System.out.println(uchildrelation);
        boolean b = terraceMapper.affirmAdd(uaccount, uname, uwork, usite, uphone, uchildrelation);
        Gson gson = new Gson();
        String s = null;
        if (b) {
            s = gson.toJson("200");
        } else {
            s = gson.toJson("100");
        }
        return s;
    }


    // 查询宝宝信息
    @GetMapping("/selectBabyinf")
    public @ResponseBody
    String selectBabyinf() {
        System.out.println("宝宝信息");
        List<BabyInf> healthbeans = terraceMapper.selectBabyinf();
        System.out.println(healthbeans.toString());
        Gson gson = new Gson();
        String s = gson.toJson(healthbeans);
        System.out.println(s);
        return s;
    }

}
