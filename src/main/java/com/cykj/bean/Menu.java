package com.cykj.bean;

/**
 * @ClassName: Menu
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/13
 */
public class Menu {
    private int mbid;
    private String mbname;
    private int rid;
    private String mburl;

    public Menu() {
    }

    public Menu(int mbid, String mbname, int rid, String mburl) {
        this.mbid = mbid;
        this.mbname = mbname;
        this.rid = rid;
        this.mburl = mburl;
    }

    public int getMbid() {
        return mbid;
    }

    public void setMbid(int mbid) {
        this.mbid = mbid;
    }

    public String getMbname() {
        return mbname;
    }

    public void setMbname(String mbname) {
        this.mbname = mbname;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getMburl() {
        return mburl;
    }

    public void setMburl(String mburl) {
        this.mburl = mburl;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mbid=" + mbid +
                ", mbname='" + mbname + '\'' +
                ", rid=" + rid +
                ", mburl='" + mburl + '\'' +
                '}';
    }
}
