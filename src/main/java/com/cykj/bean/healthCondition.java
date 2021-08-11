package com.cykj.bean;

/**
 * @ClassName: healthCondition
 * @Description:
 * @Author: ZW
 * @Date: 2021/8/8
 */
public class healthCondition {

    private int good = 0;
    private int bad = 0;
    private int ordinary = 0;

    public healthCondition() {
    }

    public healthCondition(int good, int bad, int ordinary) {
        this.good = good;
        this.bad = bad;
        this.ordinary = ordinary;
    }

    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public int getOrdinary() {
        return ordinary;
    }

    public void setOrdinary(int ordinary) {
        this.ordinary = ordinary;
    }


    @Override
    public String toString() {
        return "healthCondition{" +
                "good=" + good +
                ", bad=" + bad +
                ", ordinary=" + ordinary +
                '}';
    }
}
