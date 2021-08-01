package com.cykj.utils;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 18:29
 * @desc: 参数
 * 存放参数用的
 */
public class Parameter {
    private static String fileName;//文件名称
    private static String arrangementTime;//布置时间
    private static String publishHomeworkPath;//发布作业


    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        Parameter.fileName = fileName;
    }

    public static String getArrangementTime() {
        return arrangementTime;
    }

    public static void setArrangementTime(String arrangementTime) {
        Parameter.arrangementTime = arrangementTime;
    }

    public static String getPublishHomeworkPath() {
        return publishHomeworkPath;
    }

    public static void setPublishHomeworkPath(String publishHomeworkPath) {
        Parameter.publishHomeworkPath = publishHomeworkPath;
    }
}
