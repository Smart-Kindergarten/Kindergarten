package com.cykj.bean;

/**
 * @ClassName: 平台资讯
 * @Description:
 * @Author: ZW
 * @Date: 2021/8/1
 */
public class TerraceInformationBean {
    private  int ttid ;// id
    private  int iftID ;// 资讯编号id
    private String iftcontent ;//公告名
    private String Createtime; // 公告内容
    private String reserve1; // 创建时间
    private String reserve2;//
    private String reserve3 ;//

    public TerraceInformationBean() {
    }

    public TerraceInformationBean(int ttid, int iftID, String iftcontent, String createtime, String reserve1, String reserve2, String reserve3) {
        this.ttid = ttid;
        this.iftID = iftID;
        this.iftcontent = iftcontent;
        Createtime = createtime;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public int getTtid() {
        return ttid;
    }

    public void setTtid(int ttid) {
        this.ttid = ttid;
    }

    public int getIftID() {
        return iftID;
    }

    public void setIftID(int iftID) {
        this.iftID = iftID;
    }

    public String getIftcontent() {
        return iftcontent;
    }

    public void setIftcontent(String iftcontent) {
        this.iftcontent = iftcontent;
    }

    public String getCreatetime() {
        return Createtime;
    }

    public void setCreatetime(String createtime) {
        Createtime = createtime;
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
        return "TerraceInformationBean{" +
                "ttid=" + ttid +
                ", iftID=" + iftID +
                ", iftcontent='" + iftcontent + '\'' +
                ", Createtime='" + Createtime + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                '}';
    }
}
