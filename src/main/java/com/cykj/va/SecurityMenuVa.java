package com.cykj.va;

import com.cykj.bean.Menu;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/24 17:23
 * @desc: 动态菜单表二次处理类
 */
public class SecurityMenuVa {
    /**
     * 父表
     */
    private Menu Parentmenu;
    /**
     * 子表
     */
    private List<Menu> Submenus = new ArrayList<Menu>();

    public List<Menu> getSubmenus() {
        return Submenus;
    }

    public Menu getParentmenu() {
        return Parentmenu;
    }

    public void setParentmenu(Menu parentmenu) {
        this.Parentmenu = parentmenu;
    }

    public void setSubmenus(List<Menu> submenus) {
        Submenus = submenus;
    }

    @Override
    public String toString() {
        return "SecurityMenuVa{" +
                "menu=" + Parentmenu +
                ", Submenu=" + Submenus +
                '}';
    }
}
