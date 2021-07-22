package com.cykj.mapper;


import com.cykj.bean.Menu;
import com.cykj.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface    LoginMapper {
    List<User> checkLogin(User user);

    List<Menu> menuAll();
}
