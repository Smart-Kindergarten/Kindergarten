package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 20:20
 * @desc: 参数表
 */
public class Param {
    private int pzid;
    private int pid;
    private String ptype;
    private String pname;

    public Param() {
    }

    public Param(int pzid, int pid, String ptype, String pname) {
        this.pzid = pzid;
        this.pid = pid;
        this.ptype = ptype;
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Param{" +
                "pzid=" + pzid +
                ", pid=" + pid +
                ", ptype='" + ptype + '\'' +
                ", pname='" + pname + '\'' +
                '}';
    }

    public int getPzid() {
        return pzid;
    }

    public void setPzid(int pzid) {
        this.pzid = pzid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
