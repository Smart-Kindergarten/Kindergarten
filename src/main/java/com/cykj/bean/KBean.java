package com.cykj.bean;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/8/9 8:32
 * @desc:
 */
public class KBean {
    private String KName;
    private String date;

    @Override
    public String toString() {
        return "KBean{" +
                "KName='" + KName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getKName() {
        return KName;
    }

    public void setKName(String KName) {
        this.KName = KName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public KBean() {
    }

    public KBean(String KName, String date) {
        this.KName = KName;
        this.date = date;
    }
}
