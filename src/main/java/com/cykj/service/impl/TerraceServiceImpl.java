package com.cykj.service.impl;

import com.cykj.bean.BabyInf;
import com.cykj.bean.Healthbean;
import com.cykj.bean.User;
import com.cykj.mapper.HealthMapper;
import com.cykj.mapper.TerraceMapper;
import com.cykj.service.TerraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName: TerraceServiceImpl
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/26
 */
@Service
@Controller
@RequestMapping("/Terrace")
public class TerraceServiceImpl implements TerraceService {

    @Autowired
    private TerraceMapper terraceMapper;

    @Override
    public List<User> selectPatriarch(String biadtime,String biadtimes,String uname,int page,int pages) {
        List<User> users = terraceMapper.selectPatriarch(biadtime,biadtimes,uname,page,pages);
        return users;
    }

    @Override
    public boolean delectPatriarch(String uaccount) {
        boolean b = terraceMapper.delectPatriarch(uaccount);
        return b;
    }

    @Override
    public boolean updateState(String ustate,String uaccount) {
        boolean b = terraceMapper.updateState(ustate, uaccount);
        return b;
    }

    @Override
    public boolean affirmClick( String uname, String uwork, String usite, String uphone, String uchildrelation,String uaccount) {
        boolean b = terraceMapper.affirmClick(uname, uwork, usite, uphone, uchildrelation,uaccount);
        return b;
    }

    @Override
    public boolean affirmAdd(String uaccount, String uname,  String usite,String uwork, String uphone, String uchildrelation) {
        boolean b = terraceMapper.affirmAdd(uaccount,uname,usite,uwork,uphone,uchildrelation);
        return b;
    }

    @Override
    public List<BabyInf> selectBabyinf() {
        List<BabyInf> healthbeans = terraceMapper.selectBabyinf();
        return healthbeans;
    }
}
