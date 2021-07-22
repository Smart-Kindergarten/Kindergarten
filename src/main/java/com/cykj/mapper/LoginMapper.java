package com.cykj.mapper;


import com.cykj.bean.Menu;
import com.cykj.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
//陈子祥sb发送到事发地点丰富的水电费水电费第三方第三方

@Repository

public interface    LoginMapper {
    List<User> checkLogin(User user);

    List<Menu> menuAll();
}
