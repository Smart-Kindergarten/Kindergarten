package com.cykj.bean;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/8/15 4:41
 * @desc:
 */
public class SecurityGuardUserBen {
    //用户昵称
    private String uname;
    //用户手机号
    private String uphome;
    //用户居住地址
    private String usite;
    //职位
    private String uwork;
    //创建时间
    private String time;

    @Override
    public String toString() {
        return "SecurityGuardUserBen{" +
                "uname='" + uname + '\'' +
                ", uphome='" + uphome + '\'' +
                ", usite='" + usite + '\'' +
                ", uwork='" + uwork + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphome() {
        return uphome;
    }

    public void setUphome(String uphome) {
        this.uphome = uphome;
    }

    public String getUsite() {
        return usite;
    }

    public void setUsite(String usite) {
        this.usite = usite;
    }

    public String getUwork() {
        return uwork;
    }

    public void setUwork(String uwork) {
        this.uwork = uwork;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public SecurityGuardUserBen() {
    }

    public SecurityGuardUserBen(String uname, String uphome, String usite, String uwork, String time) {
        this.uname = uname;
        this.uphome = uphome;
        this.usite = usite;
        this.uwork = uwork;
        this.time = time;
    }
}
