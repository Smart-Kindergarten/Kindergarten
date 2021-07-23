package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/23 14:35
 * @desc: 班级相册
 */
public class Photo {
    private int phoId;              //照片id
    private String phoName;         //照片名字
    private String phoDescribe;     //照片描述
    private String photo;           //照片（保存路径）
    private String phoUploadTime;   //上传时间

    public Photo() {
    }

    public Photo(int phoId, String phoName, String phoDescribe, String photo, String phoUploadTime) {
        this.phoId = phoId;
        this.phoName = phoName;
        this.phoDescribe = phoDescribe;
        this.photo = photo;
        this.phoUploadTime = phoUploadTime;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "phoId=" + phoId +
                ", phoName='" + phoName + '\'' +
                ", phoDescribe='" + phoDescribe + '\'' +
                ", photo='" + photo + '\'' +
                ", phoUploadTime='" + phoUploadTime + '\'' +
                '}';
    }

    public int getPhoId() {
        return phoId;
    }

    public void setPhoId(int phoId) {
        this.phoId = phoId;
    }

    public String getPhoName() {
        return phoName;
    }

    public void setPhoName(String phoName) {
        this.phoName = phoName;
    }

    public String getPhoDescribe() {
        return phoDescribe;
    }

    public void setPhoDescribe(String phoDescribe) {
        this.phoDescribe = phoDescribe;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoUploadTime() {
        return phoUploadTime;
    }

    public void setPhoUploadTime(String phoUploadTime) {
        this.phoUploadTime = phoUploadTime;
    }
}
