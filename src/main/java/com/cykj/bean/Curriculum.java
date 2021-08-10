package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/23 0:46
 * @desc: 课程表
 */
public class Curriculum {
    private int currId;             //课程表id
    private String currLessons;     //课节
    private String currDate;        //日期
    private String currMonday;      //周一
    private String currTuesday;     //周二
    private String currWednesday;   //周三
    private String currThursday;    //周四
    private String currFriday;      //周五
    private int classId;            //班级id
    private int page;
    private String back;

    public Curriculum() {
    }

    public Curriculum(int currId, String currLessons, String currDate, String currMonday, String currTuesday, String currWednesday, String currThursday, String currFriday, int classId) {
        this.currId = currId;
        this.currLessons = currLessons;
        this.currDate = currDate;
        this.currMonday = currMonday;
        this.currTuesday = currTuesday;
        this.currWednesday = currWednesday;
        this.currThursday = currThursday;
        this.currFriday = currFriday;
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "currId=" + currId +
                ", currLessons='" + currLessons + '\'' +
                ", currDate='" + currDate + '\'' +
                ", currMonday='" + currMonday + '\'' +
                ", currTuesday='" + currTuesday + '\'' +
                ", currWednesday='" + currWednesday + '\'' +
                ", currThursday='" + currThursday + '\'' +
                ", currFriday='" + currFriday + '\'' +
                ", classId=" + classId +
                '}';
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCurrId() {
        return currId;
    }

    public void setCurrId(int currId) {
        this.currId = currId;
    }

    public String getCurrLessons() {
        return currLessons;
    }

    public void setCurrLessons(String currLessons) {
        this.currLessons = currLessons;
    }

    public String getCurrDate() {
        return currDate;
    }

    public void setCurrDate(String currDate) {
        this.currDate = currDate;
    }

    public String getCurrMonday() {
        return currMonday;
    }

    public void setCurrMonday(String currMonday) {
        this.currMonday = currMonday;
    }

    public String getCurrTuesday() {
        return currTuesday;
    }

    public void setCurrTuesday(String currTuesday) {
        this.currTuesday = currTuesday;
    }

    public String getCurrWednesday() {
        return currWednesday;
    }

    public void setCurrWednesday(String currWednesday) {
        this.currWednesday = currWednesday;
    }

    public String getCurrThursday() {
        return currThursday;
    }

    public void setCurrThursday(String currThursday) {
        this.currThursday = currThursday;
    }

    public String getCurrFriday() {
        return currFriday;
    }

    public void setCurrFriday(String currFriday) {
        this.currFriday = currFriday;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
