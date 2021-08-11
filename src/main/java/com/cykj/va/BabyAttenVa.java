package com.cykj.va;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/11 0:07
 * @desc:
 */
public class BabyAttenVa {
    private int biid; // 宝宝id
    private String biname;// 宝宝名字
    private String uname;
    private String attendanceDate;//时间段
    private String bisex;// 宝宝性别

    @Override
    public String toString() {
        return "BabyAttenVa{" +
                "biid=" + biid +
                ", biname='" + biname + '\'' +
                ", uname='" + uname + '\'' +
                ", attendanceDate='" + attendanceDate + '\'' +
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

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getBisex() {
        return bisex;
    }

    public void setBisex(String bisex) {
        this.bisex = bisex;
    }
}
