package com.cykj.bean;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/30 21:51
 * @desc:
 */
public class pick {
    /**
     * 宝宝ID
     */
    private String biid = null;
    /**
     * 宝宝被接送时间
     */
    private String time = null;
    /**
     * 接送宝宝的家长名
     */
    private String uname = null;
    /**
     * 接送宝宝的家长ID
     */
    private String uid = null;
    /**
     * 此条数据的状态
     */
    private String state = null;
    /**
     * 宝宝姓名
     */
    private String bname = null;
    /**
     * 性别
     */
    private String sex = null;

    public pick() {
    }

    public pick(String biid, String time, String uname, String uid, String state, String bname, String sex) {
        this.biid = biid;
        this.time = time;
        this.uname = uname;
        this.uid = uid;
        this.state = state;
        this.bname = bname;
        this.sex = sex;
    }

    public String getBiid() {
        return biid;
    }

    @Override
    public String toString() {
        return "pick{" +
                "biid='" + biid + '\'' +
                ", time='" + time + '\'' +
                ", uname='" + uname + '\'' +
                ", uid='" + uid + '\'' +
                ", state='" + state + '\'' +
                ", bname='" + bname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setBiid(String biid) {
        this.biid = biid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
