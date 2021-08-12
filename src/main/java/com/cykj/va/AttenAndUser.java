package com.cykj.va;

/**
 * @ClassName: AttenAndUser
 * @Description: 宝宝考勤and用户
 * @Author: BWL
 * @Date: 2021/8/12
 */
public class AttenAndUser {

    //考勤id
    private int attendanceId;
    //宝宝id
    private int babyId;
    //班级id
    private int classId;
    //时间段
    private String timePeriod;
    //日期
    private String attendanceDate;
    //周一
    private String monday;
    //周二
    private String tuesday;
    //周三
    private String wednesday;
    //周四
    private String thursday;
    //周五
    private String friday;

    //用户电话号码
    private String uphone;

    public AttenAndUser() {

    }

    public AttenAndUser(int attendanceId, int babyId, int classId, String timePeriod, String attendanceDate, String monday, String tuesday, String wednesday, String thursday, String friday, String uphone) {
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
        this.uphone = uphone;
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

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    @Override
    public String toString() {
        return "AttenAndUser{" +
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
                ", uphone='" + uphone + '\'' +
                '}';
    }
}
