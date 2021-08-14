package com.cykj;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(System.getProperty("user.dir"));
    }

    @Test
    public void test() {
        String date1 = "2021-08-01";
        String date2 = "2021-07-26";
        String date3 = "2021-07-19";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTime = null;
        Date date = null;
        Date parse = null;
        try {
            dateTime = simpleDateFormat.parse(date1);
            date = simpleDateFormat.parse(date2);
            parse = simpleDateFormat.parse(date3);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dateTime.getTime());
        System.out.println(date.getTime());
        System.out.println(parse.getTime());
        long l = date.getTime() - parse.getTime();
        System.out.println("一周：" + l);
        long l1 = dateTime.getTime() + l;
        System.out.println(l1);
        String format = simpleDateFormat.format(l1);
        System.out.println("新的一周：" + format);
        long l2 = dateTime.getTime() - l;
        System.out.println(l2);
        String s = simpleDateFormat.format(l2);
        System.out.println("旧的一周：" + s);

    }

    /**
     * 获取当前日的一周前和一周后
     */
    @Test
    public void getDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, -7);
        Date d = c.getTime();
        String day = format.format(d);
        System.out.println("过去七天：" + day);
        c.setTime(new Date());
        c.add(Calendar.DATE, 7);
        Date time = c.getTime();
        String s = format.format(time);
        System.out.println("未来七天：" + s);
    }

    /*
     *获取本周的第一天
     */
    @Test
    public void getWeek() {
        String date = "2021-08-01";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        cal.add(Calendar.WEEK_OF_MONTH, 0);
        /*
        get 和 set 的字段数字，指示当前月中的星期数。
        正如 getFirstDayOfWeek() 和 getMinimalDaysInFirstWeek() 所定义的那样，一个月中第一个星期的值为 1。
        子类定义一个月第一个星期之前的天数，即 WEEK_OF_MONTH 的值。
         */
        cal.set(Calendar.DAY_OF_WEEK, 2);
        /*
        get 和 set 的字段数字，指示一个星期中的某天。
        该字段可取的值为 SUNDAY、MONDAY、TUESDAY、WEDNESDAY、
        THURSDAY、FRIDAY 和 SATURDAY。
         */
        Date time = cal.getTime();
        System.out.println(dateFormat.format(time));
    }

    //设置周一为每周的第一天
    @Test
    public void getMonday() {
        String date = "2021-07-27";
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
        System.out.println(format.format(cal.getTime()));
    }

    @Test
    public void getDate1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);
    }

    @Test
    public void downloadLocal(HttpServletResponse response) throws FileNotFoundException {
        // 下载本地文件
        String fileName = "Operator.doc".toString(); // 文件的默认保存名
        // 读到流中
        InputStream inStream = new FileInputStream("c:/Operator.doc");// 文件的存放路径
        // 设置输出的格式
        response.reset();
//        response.setContentType("bin");
        response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        // 循环取出流中的数据
        byte[] b = new byte[100];
        int len;
        try {
            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getdate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    }

}
