package com.cykj.bean;

/**
 * @ClassName: Announcement
 * @Description: 校园公告Bean
 * @Author: BWL
 * @Date: 2021/8/11
 */
public class Announcement {

    //id
    private int ID;
    //公告名称
    private String messageName;
    //公告内容
    private String message;
    //创建时间
    private String creationTime;
    //备用字段1
    private String backUp1;
    //备用字段2
    private String backUP2;

    public Announcement() {

    }

    public Announcement(int ID, String messageName, String message, String creationTime, String backUp1, String backUP2) {
        this.ID = ID;
        this.messageName = messageName;
        this.message = message;
        this.creationTime = creationTime;
        this.backUp1 = backUp1;
        this.backUP2 = backUP2;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getBackUp1() {
        return backUp1;
    }

    public void setBackUp1(String backUp1) {
        this.backUp1 = backUp1;
    }

    public String getBackUP2() {
        return backUP2;
    }

    public void setBackUP2(String backUP2) {
        this.backUP2 = backUP2;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "ID=" + ID +
                ", messageName='" + messageName + '\'' +
                ", message='" + message + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", backUp1='" + backUp1 + '\'' +
                ", backUP2='" + backUP2 + '\'' +
                '}';
    }
}
