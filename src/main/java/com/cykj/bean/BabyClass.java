package com.cykj.bean;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/8/2 18:17
 * @desc:
 */
public class BabyClass {
    /**
     * 班级名称
     */
    private String ClassBabyName;
    /**
     * 班级ID
     */
    private String ClassID;

    @Override
    public String toString() {
        return "BabyClass{" +
                "ClassBabyName='" + ClassBabyName + '\'' +
                ", ClassID='" + ClassID + '\'' +
                '}';
    }

    public BabyClass(String classBabyName, String classID) {
        ClassBabyName = classBabyName;
        ClassID = classID;
    }

    public BabyClass() {
    }

    public String getClassBabyName() {
        return ClassBabyName;
    }

    public void setClassBabyName(String classBabyName) {
        ClassBabyName = classBabyName;
    }

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String classID) {
        ClassID = classID;
    }
}
