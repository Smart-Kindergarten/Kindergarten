package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 23:48
 * @desc: 查看作业
 */
public class CheckHomework {
    private int chId;//查看作业id
    private int classId;//班级id
    private int phId;//作业id
    private int babyId;//宝宝id
    private String completionTime;//完成时间
    private int completion;//完成情况(参数id)
    private String evaluation;//作业评价
    private String homeworkURL;//宝宝作业上传URL
    private String workName;//宝宝作业名
    //备用字段，需要使用请修改注释，若有增加新字段，请修改有参构造函数和toString方法
    private String ch1;//
    private String ch2;//
    private String ch3;//

    public CheckHomework() {
    }

    public CheckHomework(int chId, int classId, int phId, int babyId, String completionTime, int completion, String evaluation, String homeworkURL, String workName, String ch1, String ch2, String ch3) {
        this.chId = chId;
        this.classId = classId;
        this.phId = phId;
        this.babyId = babyId;
        this.completionTime = completionTime;
        this.completion = completion;
        this.evaluation = evaluation;
        this.homeworkURL = homeworkURL;
        this.workName = workName;
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
    }

    @Override
    public String toString() {
        return "CheckHomework{" +
                "chId=" + chId +
                ", classId=" + classId +
                ", phId=" + phId +
                ", babyId=" + babyId +
                ", completionTime='" + completionTime + '\'' +
                ", completion=" + completion +
                ", evaluation='" + evaluation + '\'' +
                ", homeworkURL='" + homeworkURL + '\'' +
                ", workName='" + workName + '\'' +
                ", ch1='" + ch1 + '\'' +
                ", ch2='" + ch2 + '\'' +
                ", ch3='" + ch3 + '\'' +
                '}';
    }

    public int getChId() {
        return chId;
    }

    public void setChId(int chId) {
        this.chId = chId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getPhId() {
        return phId;
    }

    public void setPhId(int phId) {
        this.phId = phId;
    }

    public int getBabyId() {
        return babyId;
    }

    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    public int getCompletion() {
        return completion;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getHomeworkURL() {
        return homeworkURL;
    }

    public void setHomeworkURL(String homeworkURL) {
        this.homeworkURL = homeworkURL;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getCh1() {
        return ch1;
    }

    public void setCh1(String ch1) {
        this.ch1 = ch1;
    }

    public String getCh2() {
        return ch2;
    }

    public void setCh2(String ch2) {
        this.ch2 = ch2;
    }

    public String getCh3() {
        return ch3;
    }

    public void setCh3(String ch3) {
        this.ch3 = ch3;
    }
}
