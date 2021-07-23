package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/23 14:51
 * @desc: 安全教育试题记录
 */
public class Security {
    private int secId;              //安全教育试题记录id
    private int baId;               //宝宝id
    private String baName;          //宝宝名字
    private String patriarchName;   //家长名称
    private String videoId;         //视频名称(id)
    private String endTime;         //结束时间
    private String completeTime;    //完成时间
    private String secScore;        //得分
    private int completeId;         //完成情况（参数表）id


    public Security() {
    }


    public Security(int secId, int baId, String baName, String patriarchName, String videoId, String endTime, String completeTime, String secScore, int completeId) {
        this.secId = secId;
        this.baId = baId;
        this.baName = baName;
        this.patriarchName = patriarchName;
        this.videoId = videoId;
        this.endTime = endTime;
        this.completeTime = completeTime;
        this.secScore = secScore;
        this.completeId = completeId;
    }

    @Override
    public String toString() {
        return "Security{" +
                "secId=" + secId +
                ", baId=" + baId +
                ", baName='" + baName + '\'' +
                ", patriarchName='" + patriarchName + '\'' +
                ", videoId='" + videoId + '\'' +
                ", endTime='" + endTime + '\'' +
                ", completeTime='" + completeTime + '\'' +
                ", secScore='" + secScore + '\'' +
                ", completeId=" + completeId +
                '}';
    }

    public int getSecId() {
        return secId;
    }

    public void setSecId(int secId) {
        this.secId = secId;
    }

    public int getBaId() {
        return baId;
    }

    public void setBaId(int baId) {
        this.baId = baId;
    }

    public String getBaName() {
        return baName;
    }

    public void setBaName(String baName) {
        this.baName = baName;
    }

    public String getPatriarchName() {
        return patriarchName;
    }

    public void setPatriarchName(String patriarchName) {
        this.patriarchName = patriarchName;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
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

    public int getCompleteId() {
        return completeId;
    }

    public void setCompleteId(int completeId) {
        this.completeId = completeId;
    }
}
