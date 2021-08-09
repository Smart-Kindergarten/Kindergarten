package com.cykj.va;

/**
 * @ClassName: ChildHomeWork
 * @Description: 亲子作业
 * @Author: BWL
 * @Date: 2021/8/5
 */
public class ChildHomeWork {

    //宝宝名称
    private String biname;
    //作业名称
    private String homeworkContent;
    //查看作业路径
    private String homeworkURL;
    //布置时间
    private String arrangementTime;
    //提交作业路径
    private String tjurl;
    //完成情况
    private String pname;
    //用户电话号码
    private String uphone;

    //作业评价
    private String evaluation;

    //查看作业id
    private int chId;
    //班级id
    private int classId;
    //作业id
    private int phId;
    //宝宝id
    private int babyId;
    //完成时间
    private int completionTime;
    //完成情况
    private int completion;
    //宝宝作业名
    private String workName;

    public ChildHomeWork() {

    }

    public ChildHomeWork(String biname, String homeworkContent, String homeworkURL, String arrangementTime, String tjurl, String pname, String uphone, String evaluation, int chId, int classId, int phId, int babyId, int completionTime, int completion, String workName) {
        this.biname = biname;
        this.homeworkContent = homeworkContent;
        this.homeworkURL = homeworkURL;
        this.arrangementTime = arrangementTime;
        this.tjurl = tjurl;
        this.pname = pname;
        this.uphone = uphone;
        this.evaluation = evaluation;
        this.chId = chId;
        this.classId = classId;
        this.phId = phId;
        this.babyId = babyId;
        this.completionTime = completionTime;
        this.completion = completion;
        this.workName = workName;
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

    public String getBiname() {
        return biname;
    }

    public void setBiname(String biname) {
        this.biname = biname;
    }

    public String getHomeworkContent() {
        return homeworkContent;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homeworkContent = homeworkContent;
    }

    public String getHomeworkURL() {
        return homeworkURL;
    }

    public void setHomeworkURL(String homeworkURL) {
        this.homeworkURL = homeworkURL;
    }

    public String getArrangementTime() {
        return arrangementTime;
    }

    public void setArrangementTime(String arrangementTime) {
        this.arrangementTime = arrangementTime;
    }

    public String getTjurl() {
        return tjurl;
    }

    public void setTjurl(String tjurl) {
        this.tjurl = tjurl;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }


    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    @Override
    public String toString() {
        return "ChildHomeWork{" +
                "biname='" + biname + '\'' +
                ", homeworkContent='" + homeworkContent + '\'' +
                ", homeworkURL='" + homeworkURL + '\'' +
                ", arrangementTime='" + arrangementTime + '\'' +
                ", tjurl='" + tjurl + '\'' +
                ", pname='" + pname + '\'' +
                ", uphone='" + uphone + '\'' +
                ", evaluation='" + evaluation + '\'' +
                ", chId=" + chId +
                ", classId=" + classId +
                ", phId=" + phId +
                ", babyId=" + babyId +
                ", completionTime=" + completionTime +
                ", completion=" + completion +
                ", workName='" + workName + '\'' +
                '}';
    }
}
