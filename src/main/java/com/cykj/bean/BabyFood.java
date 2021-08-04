package com.cykj.bean;

/**
 * @ClassName: BabyFood
 * @Description: 膳食表
 * @Author: BWL
 * @Date: 2021/8/5
 */
public class BabyFood {

    //宝宝膳食id
    private int fid;
    //用餐时间
    private String ftime;
    //用餐周期
    private String fdate;
    //周一
    private String fone;
    //周二
    private String ftow;
    //周三
    private String fthree;
    //周四
    private String ffour;
    //周五
    private String ffive;
    //备用字段
    private String reserve1;
    private String reserve2;
    private String reserve3;

    public BabyFood() {

    }

    public BabyFood(int fid, String ftime, String fdate, String fone, String ftow, String fthree, String ffour, String ffive, String reserve1, String reserve2, String reserve3) {
        this.fid = fid;
        this.ftime = ftime;
        this.fdate = fdate;
        this.fone = fone;
        this.ftow = ftow;
        this.fthree = fthree;
        this.ffour = ffour;
        this.ffive = ffive;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }

    public String getFdate() {
        return fdate;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFtow() {
        return ftow;
    }

    public void setFtow(String ftow) {
        this.ftow = ftow;
    }

    public String getFthree() {
        return fthree;
    }

    public void setFthree(String fthree) {
        this.fthree = fthree;
    }

    public String getFfour() {
        return ffour;
    }

    public void setFfour(String ffour) {
        this.ffour = ffour;
    }

    public String getFfive() {
        return ffive;
    }

    public void setFfive(String ffive) {
        this.ffive = ffive;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    @Override
    public String toString() {
        return "BabyFood{" +
                "fid=" + fid +
                ", ftime='" + ftime + '\'' +
                ", fdate='" + fdate + '\'' +
                ", fone='" + fone + '\'' +
                ", ftow='" + ftow + '\'' +
                ", fthree='" + fthree + '\'' +
                ", ffour='" + ffour + '\'' +
                ", ffive='" + ffive + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                '}';
    }
}
