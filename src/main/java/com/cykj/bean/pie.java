package com.cykj.bean;

/**
 * @ClassName: pie
 * @Description:
 * @Author: ZW
 * @Date: 2021/8/8
 */
public class pie {
    private String man ;
    private String woman ;

    public pie() {
    }

    public pie(String man, String woman) {
        this.man = man;
        this.woman = woman;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getWoman() {
        return woman;
    }

    public void setWoman(String woman) {
        this.woman = woman;
    }

    @Override
    public String toString() {
        return "pie{" +
                "man='" + man + '\'' +
                ", woman='" + woman + '\'' +
                '}';
    }
}
