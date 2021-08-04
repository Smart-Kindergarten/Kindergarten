package com.cykj.va;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/4 21:04
 * @desc: 查询安全教育试题记录表
 */
public class CheckSafEduTestRecord {
    private int biid;               //宝宝id
    private String biname;          //宝宝名字
    private String uname;           //家长名称
    private String videoName;       //视频名称
    private String endTime;         //结束时间
    private String completeTime;    //完成时间
    private String secScore;        //得分
    private String pname;           //完成情况


    @Override
    public String toString() {
        return "CheckSafEduTestRecord{" +
                "biid=" + biid +
                ", biname='" + biname + '\'' +
                ", uname='" + uname + '\'' +
                ", videoName='" + videoName + '\'' +
                ", endTime='" + endTime + '\'' +
                ", completeTime='" + completeTime + '\'' +
                ", secScore='" + secScore + '\'' +
                ", pname='" + pname + '\'' +
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

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getSecScore() {
        return secScore;
    }

    public void setSecScore(String secScore) {
        this.secScore = secScore;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
