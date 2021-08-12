package com.cykj.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : qiyuan
 * @version 1.0
 * @date: 2021/8/12 13:30
 * @desc: 消息实体
 */
public class MsgInfo implements Serializable {
    /**
     * 消息id
     */
    private Integer id;

    /**
     * 消息发送者id
     */
    private Integer fromUserId;

    /**
     * 消息发送者名称
     */
    private String fromUserName;

    /**
     * 消息接收者id
     */
    private Integer toUserId;

    /**
     * 消息接收者名称
     */
    private String toUserName;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 消息发送时间
     */
    private Date createTime;

    /**
     * 是否已读（1 已读）
     */
    private Integer unReadFlag;

    private static final long serialVersionUID = 1L;

    public MsgInfo() {
    }

    public MsgInfo(Integer id, Integer fromUserId, String fromUserName, Integer toUserId, String toUserName, String content, Date createTime, Integer unReadFlag) {
        this.id = id;
        this.fromUserId = fromUserId;
        this.fromUserName = fromUserName;
        this.toUserId = toUserId;
        this.toUserName = toUserName;
        this.content = content;
        this.createTime = createTime;
        this.unReadFlag = unReadFlag;
    }

    @Override
    public String toString() {
        return "MsgInfo{" +
                "id=" + id +
                ", fromUserId=" + fromUserId +
                ", fromUserName='" + fromUserName + '\'' +
                ", toUserId=" + toUserId +
                ", toUserName='" + toUserName + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", unReadFlag=" + unReadFlag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUnReadFlag() {
        return unReadFlag;
    }

    public void setUnReadFlag(Integer unReadFlag) {
        this.unReadFlag = unReadFlag;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
