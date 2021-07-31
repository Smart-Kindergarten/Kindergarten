package com.cykj.bean;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/31 16:45
 * @desc:
 */
public class Baby {
    /**
     * 宝宝ID
     */
    private String bid;
    /**
     * 宝宝名称
     */
    private String bname;
    /**
     * 不明字段 数据库无注释
     */
    private String biytd;
    /**
     * 宝宝种族
     */
    private String biresidence;
    /**
     * 宝宝性别
     */
    private String bisex;
    /**
     * 宝宝班级
     */
    private String className;
    /**
     * 宝宝所在班级的班主任
     */
    private String uname;

    @Override
    public String toString() {
        return "Baby{" +
                "bid='" + bid + '\'' +
                ", bname='" + bname + '\'' +
                ", biytd='" + biytd + '\'' +
                ", biresidence='" + biresidence + '\'' +
                ", bisex='" + bisex + '\'' +
                ", className='" + className + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBiytd() {
        return biytd;
    }

    public void setBiytd(String biytd) {
        this.biytd = biytd;
    }

    public String getBiresidence() {
        return biresidence;
    }

    public void setBiresidence(String biresidence) {
        this.biresidence = biresidence;
    }

    public String getBisex() {
        return bisex;
    }

    public void setBisex(String bisex) {
        this.bisex = bisex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Baby() {
    }

    public Baby(String bid, String bname, String biytd, String biresidence, String bisex, String className, String uname) {
        this.bid = bid;
        this.bname = bname;
        this.biytd = biytd;
        this.biresidence = biresidence;
        this.bisex = bisex;
        this.className = className;
        this.uname = uname;
    }
}
