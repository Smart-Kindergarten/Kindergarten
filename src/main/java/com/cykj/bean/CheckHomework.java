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
    private int babyId;//宝宝id
    private int completionTime;//完成时间
    private int completion;//完成情况(参数id)
    private int evaluation;//作业评价
    private int homeworkURL;//宝宝作业上传URL
    //备用字段，需要使用请修改注释，若有增加新字段，请修改有参构造函数和toString方法
    private int ch1;//
    private int ch2;//
    private int ch3;//

    public CheckHomework() {
    }

    public CheckHomework(int chId, int classId, int babyId, int completionTime, int completion, int evaluation, int homeworkURL, int ch1, int ch2, int ch3) {
        this.chId = chId;
        this.classId = classId;
        this.babyId = babyId;
        this.completionTime = completionTime;
        this.completion = completion;
        this.evaluation = evaluation;
        this.homeworkURL = homeworkURL;
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
    }

    @Override
    public String toString() {
        return "CheckHomework{" +
                "chId=" + chId +
                ", classId=" + classId +
                ", babyId=" + babyId +
                ", completionTime=" + completionTime +
                ", completion=" + completion +
                ", evaluation=" + evaluation +
                ", homeworkURL=" + homeworkURL +
                ", ch1=" + ch1 +
                ", ch2=" + ch2 +
                ", ch3=" + ch3 +
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

    public int getBabyId() {
        return babyId;
    }

    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    public int getCompletion() {
        return completion;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public int getHomeworkURL() {
        return homeworkURL;
    }

    public void setHomeworkURL(int homeworkURL) {
        this.homeworkURL = homeworkURL;
    }

    public int getCh1() {
        return ch1;
    }

    public void setCh1(int ch1) {
        this.ch1 = ch1;
    }

    public int getCh2() {
        return ch2;
    }

    public void setCh2(int ch2) {
        this.ch2 = ch2;
    }

    public int getCh3() {
        return ch3;
    }

    public void setCh3(int ch3) {
        this.ch3 = ch3;
    }
}
