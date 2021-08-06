package com.cykj.service;

import com.cykj.bean.BabyInf;
import com.cykj.bean.Healthbean;
import com.cykj.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TerraceService {
    // 查询家长
    public List<User> selectPatriarch(String biadtime,String biadtimes,String uname,int page, int pages);

    // 删除
    public boolean delectPatriarch(String uaccount);

    // 修改状态
    public boolean updateState(String ustate,String uaccount);

    // 确认修改
    public boolean affirmClick(String uname,String uwork,String usite,String uphone,String uchildrelation,String uaccount);

    // 确认新增
    public boolean affirmAdd(String uaccount,String uname,String usite,String uwork,String uphone,String uchildrelation);

    // 查询宝宝信息
    public List<BabyInf> selectBabyinf();

}
