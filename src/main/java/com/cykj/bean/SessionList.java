package com.cykj.bean;

import java.io.Serializable;

/**
 * @author : qiyuan
 * @version 1.0
 * @date: 2021/8/12 13:38
 * @desc: 会话实体
 */
public class SessionList implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 所属用户
     */
    private Integer userId;

    /**
     * 所属用户
     */
    private Integer toUserId;

    /**
     * 会话名称
     */
    private String listName;

    /**
     * 未读消息数
     */
    private Integer unReadCount;

    private static final long serialVersionUID = 1L;

    public SessionList() {
    }

    public SessionList(Integer id, Integer userId, Integer toUserId, String listName, Integer unReadCount) {
        this.id = id;
        this.userId = userId;
        this.toUserId = toUserId;
        this.listName = listName;
        this.unReadCount = unReadCount;
    }

    @Override
    public String toString() {
        return "SessionList{" +
                "id=" + id +
                ", userId=" + userId +
                ", toUserId=" + toUserId +
                ", listName='" + listName + '\'' +
                ", unReadCount=" + unReadCount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Integer getUnReadCount() {
        return unReadCount;
    }

    public void setUnReadCount(Integer unReadCount) {
        this.unReadCount = unReadCount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
