package com.cykj.bean;

/**
 * @ClassName: 亲子阅读
 * @Description:
 * @Author: ZW
 * @Date: 2021/8/1
 */
public class FamilyRead {
    private int frid; // id
    private int bookid;//绘本编号
    private String bookname;// 绘本名称
    private String Folderaddress;//文件夹地址
    private String UploadTime;// 上传时间
    private String reserve1;
    private String reserve2;
    private String reserve3;

    public FamilyRead() {
    }

    public FamilyRead(int frid, int bookid, String bookname, String folderaddress, String uploadTime, String reserve1, String reserve2, String reserve3) {
        this.frid = frid;
        this.bookid = bookid;
        this.bookname = bookname;
        Folderaddress = folderaddress;
        UploadTime = uploadTime;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public int getFrid() {
        return frid;
    }

    public void setFrid(int frid) {
        this.frid = frid;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getFolderaddress() {
        return Folderaddress;
    }

    public void setFolderaddress(String folderaddress) {
        Folderaddress = folderaddress;
    }

    public String getUploadTime() {
        return UploadTime;
    }

    public void setUploadTime(String uploadTime) {
        UploadTime = uploadTime;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    @Override
    public String toString() {
        return "FamilyRead{" +
                "frid=" + frid +
                ", bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", Folderaddress='" + Folderaddress + '\'' +
                ", UploadTime='" + UploadTime + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                '}';
    }
}
