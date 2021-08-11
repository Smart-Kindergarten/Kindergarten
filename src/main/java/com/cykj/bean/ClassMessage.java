package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/9 23:29
 * @desc: 班级公告
 */
public class ClassMessage {
    private int classMessageId;      //班级公告
    private int classId;            //班级编号
    private String message;         //消息内容
    private String messageTime;     //消息时间
    private String className;       //班级名称

    public ClassMessage() {
    }

    public ClassMessage(int classMessageId, int classId, String message, String messageTime, String className) {
        this.classMessageId = classMessageId;
        this.classId = classId;
        this.message = message;
        this.messageTime = messageTime;
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassMessage{" +
                "classMessageId=" + classMessageId +
                ", classId=" + classId +
                ", message='" + message + '\'' +
                ", messageTime='" + messageTime + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public int getClassMessageId() {
        return classMessageId;
    }

    public void setClassMessageId(int classMessageId) {
        this.classMessageId = classMessageId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
