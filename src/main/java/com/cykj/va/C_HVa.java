package com.cykj.va;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/2 0:00
 * @desc: 查看作业va
 */
public class C_HVa {
    private int chId;
    private int biid;//宝宝编号
    private String biname;//宝宝名称
    private String uname;//家长名称
    private String homeworkURL;//作业内容
    private String arrangementTime;//发布时间
    private String completionTime;//完成时间

    @Override
    public String toString() {
        return "C_HVa{" +
                "chId=" + chId +
                ", biid=" + biid +
                ", biname='" + biname + '\'' +
                ", uname='" + uname + '\'' +
                ", homeworkURL='" + homeworkURL + '\'' +
                ", arrangementTime='" + arrangementTime + '\'' +
                ", completionTime='" + completionTime + '\'' +
                '}';
    }

    public int getChId() {
        return chId;
    }

    public void setChId(int chId) {
        this.chId = chId;
    }

    public int getBiid() {
        return biid;
    }

    public void setBiid(int biid) {
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

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }
}
