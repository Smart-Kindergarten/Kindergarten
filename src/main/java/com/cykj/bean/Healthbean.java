package com.cykj.bean;

/**
 * @ClassName: 保健表
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/25
 */
public class Healthbean {
    private int babyheid; //id
    private String babyname;// 宝宝名
    private String height;//宝宝高
    private String weight;// 宝宝体重
    private String eyesight;// 宝宝视力
    private String temperature;// 宝宝体温
    private String healthcondition;// 宝宝健康状况
    private String checkuptime;// 宝宝体检时间
    private int babyid;//宝宝id
    private String reserve1;//备用1
    private String reserve2;//备用2
    private String reserve3;// 备用3

    public Healthbean() {
    }

    public Healthbean(int babyheid, String babyname, String height, String weight, String eyesight, String temperature, String healthcondition, String checkuptime, int babyid, String reserve1, String reserve2, String reserve3) {
        this.babyheid = babyheid;
        this.babyname = babyname;
        this.height = height;
        this.weight = weight;
        this.eyesight = eyesight;
        this.temperature = temperature;
        this.healthcondition = healthcondition;
        this.checkuptime = checkuptime;
        this.babyid = babyid;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public int getBabyheid() {
        return babyheid;
    }

    public void setBabyheid(int babyheid) {
        this.babyheid = babyheid;
    }

    public String getBabyname() {
        return babyname;
    }

    public void setBabyname(String babyname) {
        this.babyname = babyname;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEyesight() {
        return eyesight;
    }

    public void setEyesight(String eyesight) {
        this.eyesight = eyesight;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHealthcondition() {
        return healthcondition;
    }

    public void setHealthcondition(String healthcondition) {
        this.healthcondition = healthcondition;
    }

    public String getCheckuptime() {
        return checkuptime;
    }

    public void setCheckuptime(String checkuptime) {
        this.checkuptime = checkuptime;
    }

    public int getBabyid() {
        return babyid;
    }

    public void setBabyid(int babyid) {
        this.babyid = babyid;
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
        return "Health{" +
                "babyheid=" + babyheid +
                ", babyname='" + babyname + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", eyesight='" + eyesight + '\'' +
                ", temperature='" + temperature + '\'' +
                ", healthcondition='" + healthcondition + '\'' +
                ", checkuptime='" + checkuptime + '\'' +
                ", babyid=" + babyid +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                '}';
    }
}
