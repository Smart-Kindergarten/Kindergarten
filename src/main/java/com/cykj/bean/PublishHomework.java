package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 19:14
 * @desc: 发布作业
 */
public class PublishHomework {
    private int phId;//发布作业ID
    private int classId;//班级id
    private int teacherId;//老师id
    private String homeworkContent;//作业内容
    private String arrangementTime;//布置时间
    private String homeworkURL;//发布作业URL
    //备用字段，需使用，请注释说明
    private String ph1;//
    private String ph2;//
    private String ph3;//


    public PublishHomework() {
    }


    public PublishHomework(int phId, int classId, int teacherId, String homeworkContent, String arrangementTime, String homeworkURL, String ph1, String ph2, String ph3) {
        this.phId = phId;
        this.classId = classId;
        this.teacherId = teacherId;
        this.homeworkContent = homeworkContent;
        this.arrangementTime = arrangementTime;
        this.homeworkURL = homeworkURL;
        this.ph1 = ph1;
        this.ph2 = ph2;
        this.ph3 = ph3;
    }


    @Override
    public String toString() {
        return "PublishHomework{" +
                "phId=" + phId +
                ", classId=" + classId +
                ", teacherId=" + teacherId +
                ", homeworkContent='" + homeworkContent + '\'' +
                ", arrangementTime='" + arrangementTime + '\'' +
                ", homeworkURL='" + homeworkURL + '\'' +
                ", ph1='" + ph1 + '\'' +
                ", ph2='" + ph2 + '\'' +
                ", ph3='" + ph3 + '\'' +
                '}';
    }

    public int getPhId() {
        return phId;
    }

    public void setPhId(int phId) {
        this.phId = phId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getHomeworkContent() {
        return homeworkContent;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homeworkContent = homeworkContent;
    }

    public String getArrangementTime() {
        return arrangementTime;
    }

    public void setArrangementTime(String arrangementTime) {
        this.arrangementTime = arrangementTime;
    }

    public String getHomeworkURL() {
        return homeworkURL;
    }

    public void setHomeworkURL(String homeworkURL) {
        this.homeworkURL = homeworkURL;
    }

    public String getPh1() {
        return ph1;
    }

    public void setPh1(String ph1) {
        this.ph1 = ph1;
    }

    public String getPh2() {
        return ph2;
    }

    public void setPh2(String ph2) {
        this.ph2 = ph2;
    }

    public String getPh3() {
        return ph3;
    }

    public void setPh3(String ph3) {
        this.ph3 = ph3;
    }
}
