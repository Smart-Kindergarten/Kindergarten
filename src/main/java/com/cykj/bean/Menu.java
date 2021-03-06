package com.cykj.bean;

/**
 * @ClassName: èå
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/13
 */
public class Menu {
    // èåid
    private int meid;
    private String mename;
    private int mepid;
    private String meurl;
    private String meres1;
    private String meres2;
    private String menames;
    private int pid;
    private int mid;
    private int pwid;

    public Menu() {
    }

    public Menu(int meid, String mename, int mepid, String meurl, String meres1, String meres2, String menames, int pid, int mid, int pwid) {
        this.meid = meid;
        this.mename = mename;
        this.mepid = mepid;
        this.meurl = meurl;
        this.meres1 = meres1;
        this.meres2 = meres2;
        this.menames = menames;
        this.pid = pid;
        this.mid = mid;
        this.pwid = pwid;
    }

    public int getMeid() {
        return meid;
    }

    public void setMeid(int meid) {
        this.meid = meid;
    }

    public String getMename() {
        return mename;
    }

    public void setMename(String mename) {
        this.mename = mename;
    }

    public int getMepid() {
        return mepid;
    }

    public void setMepid(int mepid) {
        this.mepid = mepid;
    }

    public String getMeurl() {
        return meurl;
    }

    public void setMeurl(String meurl) {
        this.meurl = meurl;
    }

    public String getMeres1() {
        return meres1;
    }

    public void setMeres1(String meres1) {
        this.meres1 = meres1;
    }

    public String getMeres2() {
        return meres2;
    }

    public void setMeres2(String meres2) {
        this.meres2 = meres2;
    }

    public String getMenames() {
        return menames;
    }

    public void setMenames(String menames) {
        this.menames = menames;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getPwid() {
        return pwid;
    }

    public void setPwid(int pwid) {
        this.pwid = pwid;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "meid=" + meid +
                ", mename='" + mename + '\'' +
                ", mepid=" + mepid +
                ", meurl='" + meurl + '\'' +
                ", meres1='" + meres1 + '\'' +
                ", meres2='" + meres2 + '\'' +
                ", menames='" + menames + '\'' +
                ", pid=" + pid +
                ", mid=" + mid +
                ", pwid=" + pwid +
                '}';
    }
}
