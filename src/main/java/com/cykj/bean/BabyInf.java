package com.cykj.bean;

/**
 * @ClassName: BabyInf
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/26
 */
public class BabyInf {
    private int biid; // 宝宝id
    private String biname;// 宝宝名字
    private String biytd;// 出生年月日
    private String biresidence;//户口地址
    private String bisex;// 宝宝性别
    private int uid; //  家长id
    private int clid; //  班级id
    private int doid; //  寝室id
    private String biadtime;// 入学时间
    private String bires1;// 备用字段1
    private String bires2;// 备用字段2
    private String bires3;// 备用字段3

    public BabyInf() {
    }

    public BabyInf(int biid, String biname, String biytd, String biresidence, String bisex, int uid, int clid, int doid, String biadtime, String bires1, String bires2, String bires3) {
        this.biid = biid;
        this.biname = biname;
        this.biytd = biytd;
        this.biresidence = biresidence;
        this.bisex = bisex;
        this.uid = uid;
        this.clid = clid;
        this.doid = doid;
        this.biadtime = biadtime;
        this.bires1 = bires1;
        this.bires2 = bires2;
        this.bires3 = bires3;
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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getClid() {
        return clid;
    }

    public void setClid(int clid) {
        this.clid = clid;
    }

    public int getDoid() {
        return doid;
    }

    public void setDoid(int doid) {
        this.doid = doid;
    }

    public String getBiadtime() {
        return biadtime;
    }

    public void setBiadtime(String biadtime) {
        this.biadtime = biadtime;
    }

    public String getBires1() {
        return bires1;
    }

    public void setBires1(String bires1) {
        this.bires1 = bires1;
    }

    public String getBires2() {
        return bires2;
    }

    public void setBires2(String bires2) {
        this.bires2 = bires2;
    }

    public String getBires3() {
        return bires3;
    }

    public void setBires3(String bires3) {
        this.bires3 = bires3;
    }

    @Override
    public String toString() {
        return "BabyInf{" +
                "biid=" + biid +
                ", biname='" + biname + '\'' +
                ", biytd='" + biytd + '\'' +
                ", biresidence='" + biresidence + '\'' +
                ", bisex='" + bisex + '\'' +
                ", uid=" + uid +
                ", clid=" + clid +
                ", doid=" + doid +
                ", biadtime='" + biadtime + '\'' +
                ", bires1='" + bires1 + '\'' +
                ", bires2='" + bires2 + '\'' +
                ", bires3='" + bires3 + '\'' +
                '}';
    }
}
