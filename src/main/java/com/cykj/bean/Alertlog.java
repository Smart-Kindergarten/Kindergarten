package com.cykj.bean;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/8/8 22:41
 * @desc:
 */
public class Alertlog {
    private String AID = null;
    private String pname = null;
    private String time = null;
    private String biname = null;

    public Alertlog() {
    }

    @Override
    public String toString() {
        return "Alertlog{" +
                "AID='" + AID + '\'' +
                ", pname='" + pname + '\'' +
                ", time='" + time + '\'' +
                ", biname='" + biname + '\'' +
                '}';
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBiname() {
        return biname;
    }

    public void setBiname(String biname) {
        this.biname = biname;
    }

    public Alertlog(String AID, String pname, String time, String biname) {
        this.AID = AID;
        this.pname = pname;
        this.time = time;
        this.biname = biname;
    }
}
