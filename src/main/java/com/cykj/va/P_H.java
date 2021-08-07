package com.cykj.va;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/7 23:05
 * @desc:
 */
public class P_H {
    private int phId;//发布作业ID
    private String homeworkContent;//作业内容
    private String uname;//用户名称
    private String arrangementTime;//布置时间
    private String className;       //班级名称

    @Override
    public String toString() {
        return "P_H{" +
                "phId=" + phId +
                ", homeworkContent='" + homeworkContent + '\'' +
                ", uname='" + uname + '\'' +
                ", arrangementTime='" + arrangementTime + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public int getPhId() {
        return phId;
    }

    public void setPhId(int phId) {
        this.phId = phId;
    }

    public String getHomeworkContent() {
        return homeworkContent;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homeworkContent = homeworkContent;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getArrangementTime() {
        return arrangementTime;
    }

    public void setArrangementTime(String arrangementTime) {
        this.arrangementTime = arrangementTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
