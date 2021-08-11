package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/11 0:03
 * @desc:
 */
public class BabyAtten {
    private int attendanceId;//考勤id
    private int babyId;//宝宝id
    private int classId;//班级id
    private String timePeriod;//时间段
    private String attendanceDate;//日期
    private String monday;//周一
    private String tuesday;//周二
    private String wednesday;//周三
    private String thursday;//周四
    private String friday;//周五

    public BabyAtten() {
    }

    public BabyAtten(int attendanceId, int babyId, int classId, String timePeriod, String attendanceDate, String monday, String tuesday, String wednesday, String thursday, String friday) {
        this.attendanceId = attendanceId;
        this.babyId = babyId;
        this.classId = classId;
        this.timePeriod = timePeriod;
        this.attendanceDate = attendanceDate;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
    }

    @Override
    public String toString() {
        return "BabyAtten{" +
                "attendanceId=" + attendanceId +
                ", babyId=" + babyId +
                ", classId=" + classId +
                ", timePeriod='" + timePeriod + '\'' +
                ", attendanceDate='" + attendanceDate + '\'' +
                ", monday='" + monday + '\'' +
                ", tuesday='" + tuesday + '\'' +
                ", wednesday='" + wednesday + '\'' +
                ", thursday='" + thursday + '\'' +
                ", friday='" + friday + '\'' +
                '}';
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getBabyId() {
        return babyId;
    }

    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }
}
