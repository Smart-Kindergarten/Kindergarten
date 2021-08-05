package com.cykj.va;

/**
 * @ClassName: CurrAndUser
 * @Description: 课程and用户
 * @Author: BWL
 * @Date: 2021/8/5
 */
public class CurrAndUser {

    private int currId;             //课程表id
    private String currLessons;     //课节
    private String currDate;        //日期
    private String currMonday;      //周一
    private String currTuesday;     //周二
    private String currWednesday;   //周三
    private String currThursday;    //周四
    private String currFriday;      //周五
    private int classId;            //班级id

    private String uphone;       //用户电话号码

    public CurrAndUser() {

    }

    public CurrAndUser(int currId, String currLessons, String currDate, String currMonday, String currTuesday, String currWednesday, String currThursday, String currFriday, int classId, String uphone) {
        this.currId = currId;
        this.currLessons = currLessons;
        this.currDate = currDate;
        this.currMonday = currMonday;
        this.currTuesday = currTuesday;
        this.currWednesday = currWednesday;
        this.currThursday = currThursday;
        this.currFriday = currFriday;
        this.classId = classId;
        this.uphone = uphone;
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

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    @Override
    public String toString() {
        return "CurrAndUser{" +
                "currId=" + currId +
                ", currLessons='" + currLessons + '\'' +
                ", currDate='" + currDate + '\'' +
                ", currMonday='" + currMonday + '\'' +
                ", currTuesday='" + currTuesday + '\'' +
                ", currWednesday='" + currWednesday + '\'' +
                ", currThursday='" + currThursday + '\'' +
                ", currFriday='" + currFriday + '\'' +
                ", classId=" + classId +
                ", uphone='" + uphone + '\'' +
                '}';
    }
}
