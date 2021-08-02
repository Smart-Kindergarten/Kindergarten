package com.cykj.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/27 10:27
 * @desc: 工具类
 * 获取周日期
 */
public class WeekDate {
    //设置周一为每周的第一天（星期一为一周开始）
    public static String getMonday(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        //set the first day of the week is Monday
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return format.format(cal.getTime());
    }

    //获取当前日的一周前和一周后
    public static String getDate(String week) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        String day;
        if (week.equals("LastWeek")) {
            c.add(Calendar.DATE, -7);
            Date d = c.getTime();
            day = format.format(d);
            System.out.println("过去七天：" + day);
        } else {
            c.add(Calendar.DATE, 7);
            Date time = c.getTime();
            day = format.format(time);
            System.out.println("未来七天：" + day);
        }
        return day;
    }

    //当前时间
    public static String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
//        System.out.println(format);
        return format;
    }
}
