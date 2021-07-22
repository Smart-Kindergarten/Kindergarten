package com.cykj.bean;

/**
 * @ClassName: User
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/9
 */
public class User {
    // 用户id
    private int uid;
    // 用户账号
    private String uaccount;
    // 用户密码
    private String upwd;
    // 角色id
    private int urid;
    // 用户名
    private String uname;
    // 用户状态
    private String ustate;
    //工作
    private String uwork;
    //地址
    private String usite;
    //用户电话号码
    private String uphone;
    // 亲子关系
    private String uchildrelation;
    //备用1
    private String ures1;
    //备用2
    private String ures2;
    //备用3
    private String ures3;

    public User() {
    }

    public User(int uid, String uaccount, String upwd, int urid, String uname, String ustate, String uwork, String usite, String uphone, String uchildrelation, String ures1, String ures2, String ures3) {
        this.uid = uid;
        this.uaccount = uaccount;
        this.upwd = upwd;
        this.urid = urid;
        this.uname = uname;
        this.ustate = ustate;
        this.uwork = uwork;
        this.usite = usite;
        this.uphone = uphone;
        this.uchildrelation = uchildrelation;
        this.ures1 = ures1;
        this.ures2 = ures2;
        this.ures3 = ures3;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUstate() {
        return ustate;
    }

    public void setUstate(String ustate) {
        this.ustate = ustate;
    }

    public String getUwork() {
        return uwork;
    }

    public void setUwork(String uwork) {
        this.uwork = uwork;
    }

    public String getUsite() {
        return usite;
    }

    public void setUsite(String usite) {
        this.usite = usite;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUchildrelation() {
        return uchildrelation;
    }

    public void setUchildrelation(String uchildrelation) {
        this.uchildrelation = uchildrelation;
    }

    public String getUres1() {
        return ures1;
    }

    public void setUres1(String ures1) {
        this.ures1 = ures1;
    }

    public String getUres2() {
        return ures2;
    }

    public void setUres2(String ures2) {
        this.ures2 = ures2;
    }

    public String getUres3() {
        return ures3;
    }

    public void setUres3(String ures3) {
        this.ures3 = ures3;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uaccount='" + uaccount + '\'' +
                ", upwd='" + upwd + '\'' +
                ", urid=" + urid +
                ", uname='" + uname + '\'' +
                ", ustate='" + ustate + '\'' +
                ", uwork='" + uwork + '\'' +
                ", usite='" + usite + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uchildrelation='" + uchildrelation + '\'' +
                ", ures1='" + ures1 + '\'' +
                ", ures2='" + ures2 + '\'' +
                ", ures3='" + ures3 + '\'' +
                '}';
    }
}
