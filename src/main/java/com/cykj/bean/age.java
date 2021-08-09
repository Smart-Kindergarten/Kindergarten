package com.cykj.bean;

/**
 * @ClassName: age
 * @Description:
 * @Author: ZW
 * @Date: 2021/8/8
 */
public class age {
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;

    public age() {
    }

    public age(int three, int four, int five, int six) {
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    @Override
    public String toString() {
        return "age{" +
                "three=" + three +
                ", four=" + four +
                ", five=" + five +
                ", six=" + six +
                '}';
    }
}


