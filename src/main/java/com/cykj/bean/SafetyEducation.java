package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/23 14:40
 * @desc: 安全教育
 */
public class SafetyEducation {
    private int videoId;        //视频id
    private String videoName;   //视频名称
    private String startTime;   //开始时间
    private String endTime;     //结束时间
    private String completeTime;//完成时间（无用）
    private String secScore;    //得分（无用）
    private int completeId;     //完成情况（参数表）id（无用）
    private String releaseTime; //发布时间
    private String fileName;    //文件名称
    private String fileSite;    //文件地址
    private String textUrl;     //试题URL

    public SafetyEducation() {
    }

    public SafetyEducation(int videoId, String videoName, String startTime, String endTime, String completeTime, String secScore, int completeId, String releaseTime, String fileName, String fileSite, String textUrl) {
        this.videoId = videoId;
        this.videoName = videoName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.completeTime = completeTime;
        this.secScore = secScore;
        this.completeId = completeId;
        this.releaseTime = releaseTime;
        this.fileName = fileName;
        this.fileSite = fileSite;
        this.textUrl = textUrl;
    }

    @Override
    public String toString() {
        return "SafetyEducation{" +
                "videoId=" + videoId +
                ", videoName='" + videoName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", completeTime='" + completeTime + '\'' +
                ", secScore='" + secScore + '\'' +
                ", completeId=" + completeId +
                ", releaseTime='" + releaseTime + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSite='" + fileSite + '\'' +
                ", textUrl='" + textUrl + '\'' +
                '}';
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
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

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSite() {
        return fileSite;
    }

    public void setFileSite(String fileSite) {
        this.fileSite = fileSite;
    }

    public String getTextUrl() {
        return textUrl;
    }

    public void setTextUrl(String textUrl) {
        this.textUrl = textUrl;
    }
}
