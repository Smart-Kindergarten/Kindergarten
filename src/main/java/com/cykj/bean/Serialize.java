package com.cykj.bean;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/8/14 22:45
 * @desc:
 */
public class Serialize {
    /**
     * 宝宝姓名
     */
    private String biname;
    /**
     * 父母姓名
     */
    private String uname;
    /**
     * 宝宝ID
     */
    private String biid;
    /**
     * 手机号
     */
    private String uphone;

    public Serialize(String biname, String uname, String biid, String uphone) {
        this.biname = biname;
        this.uname = uname;
        this.biid = biid;
        this.uphone = uphone;
    }

    public String getBiid() {
        return biid;
    }

    @Override
    public String toString() {
        return "Serialize{" +
                "biname='" + biname + '\'' +
                ", uname='" + uname + '\'' +
                ", biid='" + biid + '\'' +
                ", uphone='" + uphone + '\'' +
                '}';
    }

    public void setBiid(String biid) {
        this.biid = biid;
    }

    public Serialize() {
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

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }
}
