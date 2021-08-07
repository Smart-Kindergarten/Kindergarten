package com.cykj.controller;

import com.cykj.bean.*;
import com.cykj.service.impl.*;
import com.cykj.utils.Parameter;
import com.cykj.utils.WeekDate;
import com.cykj.va.C_HVa;
import com.cykj.va.CheckSafEduTestRecord;
import com.cykj.va.ClassInfo;
import com.cykj.va.P_H;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/*
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/26 9:55
 * @desc: 教师端
 */

@Controller
@RequestMapping("/teacher")
public class Teacher {
    private Gson gson = new Gson();
    @Autowired
    private CurriculumServiceImpl curriculumService;
    @Autowired
    private ClassManagementServiceImpl managementService;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private P_HServiceImpl pHService;
    @Autowired
    private C_HServiceImpl cHService;
    @Autowired
    private SafetyEducationServiceImpl educationService;
    @Autowired
    private ParamServiceImpl paramService;
    @Autowired
    private SE_ServiceImpl seService;
    @Autowired
    private BabyInfServiceImpl babyInfService;

    //查询当前日期课程表
    @ResponseBody
    @RequestMapping("/selectCurrAll")
    public String getCurrAll(int classId, String date) {
        System.out.println("-------查询课程表-------");
        String monday = WeekDate.getMonday(date);
        System.out.println(date + "这周的第一天：" + monday);
        List<Curriculum> currAll = curriculumService.selectCurrAll(classId, monday);
        String s = gson.toJson(currAll);
        System.out.println(s);
        return s;
    }

    //查询当前日期的上周或下周课程表
    @ResponseBody
    @RequestMapping("/getWeekDate")
    public String getWeekCurrAll(int classId, String week, String date) {
        System.out.println("-------查询课程表-------");
        String s1 = WeekDate.getDate(week, date);//获取到日期的上周或下周
        String monday = WeekDate.getMonday(s1);//获取到上周或下周的第一天（星期一为一周开始）
        System.out.println("日期：" + monday);
        List<Curriculum> currAll = curriculumService.selectCurrAll(classId, monday);
        String s = gson.toJson(currAll);
        System.out.println(s);
        return s;
    }

    //获得教师所在的班级
    @ResponseBody
    @RequestMapping("/getClassName")
    public String getClassName(String uAccount, HttpServletRequest req) {
        System.out.println("-------查询教师所在的班级名称-------");
        System.out.println("uAccount:" + uAccount);
        String uAcc = (String) req.getSession().getAttribute("uaccount");
        System.out.println("Acc:" + uAcc);
        List<ClassManagement> allClass = managementService.selectAllClass(uAcc);
        System.out.println(allClass);
        String s = gson.toJson(allClass);
        return s;
    }

    //查询发布作业
    @ResponseBody
    @RequestMapping("/checkPublishHomeworkint")
    public String checkPublishHomework(int classId) {
        System.out.println("-------查询发布作业-------");
        List<P_H> list = pHService.selectClassPH(classId);
        System.out.println(list);
        return gson.toJson(list);
    }

    //发布作业
    @ResponseBody
    @RequestMapping("/upHomework")
    public String upHomework(int id, String uacc) {
        System.out.println("-------发布作业-------");
        PublishHomework homework = new PublishHomework();
        homework.setClassId(id);//班级id
        homework.setTeacherId(userService.selectID(uacc));//教师id
        homework.setHomeworkContent(Parameter.getFileName());//文件名
        homework.setArrangementTime(WeekDate.getCurrentTime());//发布时间
        homework.setHomeworkURL(Parameter.getPublishHomeworkPath());//URL
        int i = pHService.insertAll(homework);
        if (i > 0) {
            return "发布成功";
        } else {
            return "发布失败";
        }
    }


    @ResponseBody
    @RequestMapping("/checkHomework")
    public String getCheckHomework(int classId) {
        System.out.println("-------查看作业-------");
        System.out.println(classId);
        List<C_HVa> cHVas = cHService.selectClassAll(classId);
        System.out.println(cHVas);
        String s = gson.toJson(cHVas);
        return s;
    }

    @ResponseBody
    @RequestMapping("/workRating")
    public String getWorkRating(int chId, String rating) {
        System.out.println("-------作业评级-------");
        System.out.println(chId + " --- " + rating);
        String s = cHService.updateRating(chId, rating);
        return s;
    }

    //文件下载（现在无法使用）
    @ResponseBody
    @GetMapping("/download")
    public HttpServletResponse download(String path, HttpServletResponse response) {
        try {
            System.out.println(path);
            // path是指欲下载的文件的路径。
            File file = new File(path);
            // 取得文件名。
            String filename = file.getName();
            // 取得文件的后缀名。
            String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();
            // 以流的形式下载文件。
            InputStream fis = new BufferedInputStream(new FileInputStream(path));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            // 设置response的Header
            response.addHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes()));
            response.addHeader("Content-Length", "" + file.length());
            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/octet-stream");
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return response;
    }

    //查询安全教育
    @ResponseBody
    @RequestMapping("/selectSafEdu")
    public String selectSafEdu() {
        System.out.println("-------查询安全教育-------");
        List<SafetyEducation> safEduAll = educationService.selectSafEduAll();
        System.out.println(safEduAll);
        String s = gson.toJson(safEduAll);
        return s;
    }

    //安全教育视频开始时间和结束时间
    @ResponseBody
    @RequestMapping("/updateTime")
    public String updateTime(SafetyEducation safetyEducation) {
        System.out.println("-------修改安全教育视频开始时间和结束时间-------");
        System.out.println(safetyEducation.getVideoId() + "," + safetyEducation.getStartTime() + "," + safetyEducation.getEndTime());
        String updateTime = educationService.updateTime(safetyEducation);
        System.out.println(updateTime);
        return updateTime;
    }

    //查询pzid，pname
    @ResponseBody
    @RequestMapping("/getPName")
    public String getParamName(String pName) {
        System.out.println("-------查询pzid，pname-------");
        System.out.println(pName);
        List<Param> list = paramService.select(pName);
        System.out.println(list);
        return gson.toJson(list);
    }

    //查询安全教育试题记录表
    @ResponseBody
    @RequestMapping("/checkSafEduTestRecord")
    public String checkSafEduTestRecord(int classId) {
        System.out.println("-------查询安全教育试题记录表-------");
        System.out.println(classId);
        List<CheckSafEduTestRecord> list = seService.selectTestRecord(classId);
        System.out.println(list);
        return gson.toJson(list);
    }

    //查询模糊  安全教育试题记录表
    @ResponseBody
    @RequestMapping("/checkFuzzy")
    public String checkFuzzy(int classId, int pzid, String wDate1, String wDate2) {
        System.out.println("-------模糊查询安全教育试题记录表-------");
        System.out.println(classId + " " + pzid + " " + wDate1 + " " + wDate2);
        List<CheckSafEduTestRecord> list = seService.fuzzySelect(classId, pzid, wDate1, wDate2);
        System.out.println(list);
        return gson.toJson(list);
    }

    //班级信息
    @ResponseBody
    @RequestMapping("/getClassInfo")
    public String getClassInfo(int classId) {
        System.out.println("-------班级信息-------");
        List<ClassInfo> info = babyInfService.selectClassInfo(classId);
        System.out.println(info);
        return gson.toJson(info);
    }

    //模糊查询入学时间
    @ResponseBody
    @RequestMapping("/fuzzySelectATime")
    public String fuzzySelectATime(int classId, String aTime1, String aTime2) {
        System.out.println("-------模糊查询入学时间-------");
        System.out.println(classId + " " + aTime1 + " " + aTime2);
        List<ClassInfo> info = babyInfService.fuzzySelectClassInfo(classId, aTime1, aTime2);
        System.out.println(info);
        return gson.toJson(info);
    }

    //宝宝信息
    @ResponseBody
    @RequestMapping("/getBabyInfo")
    public String babyInfo(int id) {
        System.out.println("-------宝宝信息-------");
        BabyInf babyInf = babyInfService.selectBabyInfo(id);
        System.out.println(babyInf);
        return gson.toJson(babyInf);
    }

    //家长信息
    @ResponseBody
    @RequestMapping("/getParentsInfo")
    public String parentsInfo(int id) {
        System.out.println("-------家长信息-------");
        User user = userService.parentsInfo(id);
        System.out.println(user);
        return gson.toJson(user);
    }


}
