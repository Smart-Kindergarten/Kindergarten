package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/23 14:51
 * @desc: 安全教育试题记录
 */
public class Security {
    private int secId;              //安全教育试题记录id
    private int classId;            //班级id
    private int baId;               //宝宝id
    private String videoId;         //视频名称(id)
    private String completeTime;    //完成时间
    private String secScore;        //得分
    private int completeId;         //完成情况（参数表）id


    public Security() {
    }

    public Security(int secId, int classId, int baId, String videoId, String completeTime, String secScore, int completeId) {
        this.secId = secId;
        this.classId = classId;
        this.baId = baId;
        this.videoId = videoId;
        this.completeTime = completeTime;
        this.secScore = secScore;
        this.completeId = completeId;
    }

    @Override
    public String toString() {
        return "Security{" +
                "secId=" + secId +
                ", classId=" + classId +
                ", baId=" + baId +
                ", videoId='" + videoId + '\'' +
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

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getBaId() {
        return baId;
    }

    public void setBaId(int baId) {
        this.baId = baId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
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
