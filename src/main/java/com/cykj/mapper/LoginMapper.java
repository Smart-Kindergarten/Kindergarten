package com.cykj.mapper;


import com.cykj.bean.Menu;
import com.cykj.bean.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface    LoginMapper {
    // 登录
    List<User> checkLogin(User user);

    // 菜单
    List<Menu> menuAll(@Param("account")String account);

}
