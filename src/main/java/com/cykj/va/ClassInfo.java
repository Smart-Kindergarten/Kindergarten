package com.cykj.va;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/5 19:50
 * @desc: 班级信息
 */
public class ClassInfo {
    private int biid; // 宝宝id
    private String biname;// 宝宝名字
    private String uname;//家长名字
    private String biadtime;// 入学时间
    private String bisex;// 宝宝性别

    @Override
    public String toString() {
        return "ClassInfo{" +
                "biid=" + biid +
                ", biname='" + biname + '\'' +
                ", uname='" + uname + '\'' +
                ", biadtime='" + biadtime + '\'' +
                ", bisex='" + bisex + '\'' +
                '}';
    }

    public int getBiid() {
        return biid;
    }

    public void setBiid(int biid) {
        this.biid = biid;
    }

    public String getBiname() {
        return biname;
    }

    public void setBiname(String biname) {
        this.biname = biname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getBiadtime() {
        return biadtime;
    }

    public void setBiadtime(String biadtime) {
        this.biadtime = biadtime;
    }

    public String getBisex() {
        return bisex;
    }

    public void setBisex(String bisex) {
        this.bisex = bisex;
    }
}
