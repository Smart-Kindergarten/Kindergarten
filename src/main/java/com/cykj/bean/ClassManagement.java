package com.cykj.bean;

/**
 * @version 1.0
 * @author: yang
 * @date: 2021/7/30 14:38
 * @desc: 班级管理
 * mapper:ClassManagementMapper
 */
public class ClassManagement {
    private int classId;            //班级编号
    private String className;       //班级名称
    private int teacher;            //班主任
    private String classRoom;       //所在教室
    private String creationTime;    //创建时间
    //备用字段，需要使用请修改注释，若有增加新字段，请修改有参构造函数和toString方法
    private String backUp1;         //
    private String backUP2;         //
    private String biid;//babyid
    private String biname;//babyName
    private String uname;//teacherName


    public ClassManagement() {
    }

    public ClassManagement(int classId, String className, int teacher, String classRoom, String creationTime, String backUp1, String backUP2) {
        this.classId = classId;
        this.className = className;
        this.teacher = teacher;
        this.classRoom = classRoom;
        this.creationTime = creationTime;
        this.backUp1 = backUp1;
        this.backUP2 = backUP2;
    }

    @Override
    public String toString() {
        return "ClassManagement{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", backUp1='" + backUp1 + '\'' +
                ", backUP2='" + backUP2 + '\'' +
                '}';
    }

    public String getBiid() {
        return biid;
    }

    public void setBiid(String biid) {
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

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
