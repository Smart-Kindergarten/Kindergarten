package com.cykj.controller;

import com.cykj.bean.*;
import com.cykj.mapper.SafetyEducationVideoMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

/**
 * @ClassName: 获取安全教育视频信息
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/27
 */
@Controller
@RequestMapping("/SafetyEducationInf")
public class SafetyEducationInf {

    Gson gson = new Gson();
    private Map<String, Object> repower = null;
    String flag = "0";
    @Autowired
    private SafetyEducationVideoMapper safetyEducationVideoMapper;

    @GetMapping("/SafetyAll")
    public @ResponseBody
    String GGB2(int page, String uaccount) {
        System.out.println("安全教育视频信息进来了");
        System.out.println(page);
        List<SafetyEducation> safetyEducations = safetyEducationVideoMapper.selectAll((page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(safetyEducations);
        System.out.println(s);
        return s;
    }


    @GetMapping("/delectVideo")
    public @ResponseBody
    String GGB2(String voids) {
        System.out.println("删除视频");
        boolean b = safetyEducationVideoMapper.delectVideo(voids);
        if (b) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        Gson gson = new Gson();
        String s = gson.toJson(b);
        System.out.println(s);
        return s;
    }


    // 获取绘本信息
    @GetMapping("/readInf")
    public @ResponseBody
    String readInf(String UploadTime, String UploadTimes, String bookname, int page) {
        System.out.println("获取绘本信息");
        System.out.println(UploadTime);
        System.out.println(UploadTimes);
        System.out.println(bookname);
        List<FamilyRead> familyReads = safetyEducationVideoMapper.selectRead(UploadTime, UploadTimes, bookname, (page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(familyReads);
        System.out.println(s);
        return s;
    }


    // 资讯爬虫
    @GetMapping("/reptile")
    public @ResponseBody
    String reptile() throws Exception {
        CloseableHttpResponse response = null;
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        URIBuilder uri = new URIBuilder("https://www.shejiyd.com/zx.html");
        //创建httpget对象，参数为url
        HttpGet httpGet = new HttpGet(uri.build());
        //发起请求
        response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == 200) {//状态码为200时，获取response
            //解析响应
            HttpEntity httpEntity = response.getEntity();
            String message = EntityUtils.toString(httpEntity, "UTF-8");
            //打印为String
//            String content = EntityUtils.toString(httpEntity, "utf8");

            String s = message.replaceAll("[^a-zA-Z0-9\\u4E00-\\u9FA5]", "");
//            System.out.println(s);
            String[] splitAddress = s.split("targetblank");


            String one = splitAddress[2];
            String[] ones = one.split("adivdivclasscontent");
            System.out.println(ones[0]);
            System.out.println(ones[1].replaceAll("[^\u4E00-\u9FA5]", ""));

            // 获取系统时间
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String hehe = dateFormat.format(now);
            boolean b = safetyEducationVideoMapper.insTerraceInf(ones[0], ones[1].replaceAll("[^\u4E00-\u9FA5]", ""), hehe, "交通");

            String two = splitAddress[5];
            String[] twos = two.split("adivdivclasscontent");
            System.out.println(twos[0]);
            System.out.println(twos[1].replaceAll("[^\u4E00-\u9FA5]", ""));
            safetyEducationVideoMapper.insTerraceInf(twos[0], twos[1].replaceAll("[^\u4E00-\u9FA5]", ""), hehe, "交通");


            String there = splitAddress[8];
            String[] theres = there.split("adivdivclasscontent");
            System.out.println(theres[0]);
            System.out.println(theres[1].replaceAll("[^\u4E00-\u9FA5]", ""));
            safetyEducationVideoMapper.insTerraceInf(theres[0], theres[1].replaceAll("[^\u4E00-\u9FA5]", ""), hehe, "亲子");


            String four = splitAddress[11];
            String[] fours = four.split("adivdivclasscontent");
            System.out.println(fours[0]);
            System.out.println(fours[1].replaceAll("[^\u4E00-\u9FA5]", ""));
            safetyEducationVideoMapper.insTerraceInf(fours[0], fours[1].replaceAll("[^\u4E00-\u9FA5]", ""), hehe, "交通");

            String five = splitAddress[14];
            String[] fives = five.split("adivdivclasscontent");
            System.out.println(fives[0]);
            System.out.println(fives[1].replaceAll("[^\u4E00-\u9FA5]", ""));
            safetyEducationVideoMapper.insTerraceInf(fives[0], fives[1].replaceAll("[^\u4E00-\u9FA5]", ""), hehe, "亲子");

        }
        return "200";
    }


    @GetMapping("/TerraceInf")
    public @ResponseBody
    String TerraceInfs(String Createtime, String Createtimes, String iftcontent, int page) throws Exception {
        System.out.println("获取平台信息");
        System.out.println(Createtime);
        System.out.println(Createtimes);
        System.out.println(iftcontent);
        System.out.println(page);
        List<TerraceInformationBean> terraceInformationBeans = safetyEducationVideoMapper.selectTerraceInf(Createtime
                , Createtimes
                , iftcontent,
                (page - 1) * 5,
                5);
        Gson gson = new Gson();
        String s = gson.toJson(terraceInformationBeans);
        System.out.println(s);
        return s;
    }


    // 新增资讯
    @GetMapping("/addTerraceInf")
    public @ResponseBody
    String TerraceInf(String ttid, String iftcontent, String types) {
        System.out.println("新增资讯");
        System.out.println("ttid" + ttid);
        System.out.println("iftcontent" + iftcontent);
        System.out.println("types" + types);
        // 获取系统时间
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String hehe = dateFormat.format(now);
        boolean b = safetyEducationVideoMapper.insTerraceInf(ttid, iftcontent, hehe, types);
        if (b) {
            System.out.println("新增资讯成功");
        }
        return "200";
    }


    // 修改资讯
    @GetMapping("/updateTerraceInf")
    public @ResponseBody
    String updateTerraceInf(String ttid, String iftcontent, String Createtime) {
        System.out.println("修改资讯");
        System.out.println("ttid" + ttid);
        System.out.println("iftcontent" + iftcontent);
        System.out.println("Createtime" + Createtime);
        // 获取系统时间
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String hehe = dateFormat.format(now);
        boolean b = safetyEducationVideoMapper.updateTerraceInf(iftcontent, Createtime, hehe, Integer.valueOf(ttid));
        if (b) {
            System.out.println("修改资讯成功");
        }
        return "200";
    }


    // 删除资讯
    @GetMapping("/delectTerraceInf")
    public @ResponseBody
    String delectTerraceInf(String ttid) {
        System.out.println("删除资讯");
        System.out.println("ttid" + ttid);
        boolean b = safetyEducationVideoMapper.delectTerraceInf(Integer.valueOf(ttid));
        if (b) {
            System.out.println("删除资讯成功");
        }
        return "200";
    }


    // 发布资讯
    @GetMapping("/issue")
    public @ResponseBody
    String issue(String ttid) {
        System.out.println("发布资讯");
        System.out.println("ttid" + ttid);
        boolean b = safetyEducationVideoMapper.updatereserve2(Integer.valueOf(ttid));
        if (b) {
            System.out.println("发布资讯成功");
        }
        return "success";
    }


    // 查询类型资讯
    @GetMapping("/types")
    public @ResponseBody
    String types(String types) {
        System.out.println("查询分类资讯");
        System.out.println("types" + types);
        List<TerraceInformationBean> terraceInformationBeans = safetyEducationVideoMapper.selectType(types);
        Gson gson = new Gson();
        String s = gson.toJson(terraceInformationBeans);
        System.out.println(s);
        return s;
    }


    // 家长查看安全视频信息 进行答题
    @GetMapping("/selectParentsVideo")
    public @ResponseBody
    String selectParentsVideo(int page) {
        System.out.println("家长查看安全视频信息 进行答题");
        System.out.println("page" + page);
        List<SafetyEducation> safetyEducations = safetyEducationVideoMapper.selectParentsVideo((page - 1) * 5, page * 5);
        Gson gson = new Gson();
        String s = gson.toJson(safetyEducations);
        System.out.println(s);
        return s;
    }


    // 确认添加绘本
    @GetMapping("/pictureBook")
    public @ResponseBody
    String pictureBook(String bookname, String booknames, String content, String pagess, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("确认添加绘本");
        String newCompanyImageName = (String) req.getSession().getAttribute("newCompanyImageName");
        System.out.println(newCompanyImageName);

        File directory = new File("src/main/resources");
        String courseFile = directory.getCanonicalPath() + "/static/js/images/";
        ;
        System.out.println(courseFile);
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String hehe = dateFormat.format(now);

        String[] splitAddress = booknames.split("\\\\");
        System.out.println(splitAddress[splitAddress.length - 1]);


        safetyEducationVideoMapper.inseRead(newCompanyImageName, courseFile + splitAddress[splitAddress.length - 1] + newCompanyImageName, hehe, pagess, content, null);

        return "200";
    }


    // 确认添加绘本
    @GetMapping("/updateBook")
    public @ResponseBody
    String updateBook(String bookname, String content, String pagess, String frid) throws IOException {
        System.out.println("重新上传绘本");
        // id
        System.out.println(frid);
        // 名称
        System.out.println(bookname);
        // 内容
        System.out.println(content);
        // 页数
        System.out.println(pagess);
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String hehe = dateFormat.format(now);

        File directory = new File("src/main/resources");
        String courseFile = directory.getCanonicalPath() + "/static/js/images/";
        ;
        System.out.println(courseFile);


        safetyEducationVideoMapper.updateRead(bookname, courseFile + bookname, hehe, pagess, content, Integer.valueOf(frid));
        return "200";
    }


    // 删除绘本
    @GetMapping("/delectbook")
    public @ResponseBody
    String delectbook(String delectid) {
        System.out.println("删除绘本");
        System.out.println();
        safetyEducationVideoMapper.delectBook(Integer.valueOf(delectid));
//        List<SafetyEducation> safetyEducations = safetyEducationVideoMapper.selectParentsVideo((page - 1) * 5, page * 5);
//        Gson gson = new Gson();
//        String s = gson.toJson(safetyEducations);
//        System.out.println(s);
        return "200";
    }


    // 统计年龄
    @GetMapping("/age")
    public @ResponseBody
    String age() {
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        String regEx = "[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
//        Pattern p = Pattern.compile(regEx);
        List<BabyInf> babyInfs = safetyEducationVideoMapper.seleleBaby();
        for (int i = 0; i < babyInfs.size(); i++) {
//            System.out.println(babyInfs.get(i).getBiytd().replaceAll("-",""));
            String s = babyInfs.get(i).getBiytd().replaceAll("-", "");
            int ss = Integer.valueOf(s);
            if (ss > 20190000 && ss < 20200000) {
                three++;
            } else if (ss > 20180000 && ss < 20190000) {
                four++;
            } else if (ss > 20170000 && ss < 20180000) {
                five++;
            } else if (ss > 20160000 && ss < 20170000) {
                six++;
            }
        }
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        age age = new age(three, four, five, six);
        Gson gson = new Gson();
        String s = gson.toJson(age);
        System.out.println(s);
        return s;
    }


    // 统计性别
    @GetMapping("/pie")
    public @ResponseBody
    String pie() {
        System.out.println("统计性别");
        List<BabyInf> babyInfs = safetyEducationVideoMapper.selectMan();
        List<BabyInf> babyInfss = safetyEducationVideoMapper.selectWoman();
        System.out.println(babyInfs.get(0).getBisex());
        System.out.println(babyInfss.get(0).getBisex());
        pie pie = new pie(babyInfs.get(0).getBisex(), babyInfss.get(0).getBisex());
        Gson gson = new Gson();
        String s = gson.toJson(pie);
        System.out.println(s);
        return s;
    }

    // 统计性别
    @GetMapping("/healthCondition")
    public @ResponseBody
    String healthCondition() {
        int good = 0;
        int bad = 0;
        int ordinary = 0;
        System.out.println("统计健康状况");
        List<Healthbean> healthbeans = safetyEducationVideoMapper.selecthealthCondition();
        for (int i = 0; i < healthbeans.size(); i++) {
            if (healthbeans.get(i).getHealthcondition().equals("健康")) {
                good++;
            } else if (healthbeans.get(i).getHealthcondition().equals("较差")) {
                bad++;
            } else {
                ordinary++;
            }
        }
        System.out.println(good);
        System.out.println(bad);
        System.out.println(ordinary);
        healthCondition healthCondition = new healthCondition(good, bad, ordinary);
        Gson gson = new Gson();
        String s = gson.toJson(healthCondition);
        System.out.println(s);
        return s;
    }


    // 菜单管理
    @GetMapping("/menuManagement")
    public @ResponseBody
    String menuManagement(String onename, String mename, int page) {
        System.out.println("菜单管理");
        List<Menu> menus = safetyEducationVideoMapper.selectMenu(onename, mename, (page - 1) * 5, 5);
        Gson gson = new Gson();
        String s = gson.toJson(menus);
        System.out.println(s);
        return s;
    }

    // 菜单管理  查询一级菜单
    @GetMapping("/selectOne")
    public @ResponseBody
    String selectOne() {
        System.out.println("一级菜单");
        List<Menu> menus = safetyEducationVideoMapper.selectOne();
        Gson gson = new Gson();
        String s = gson.toJson(menus);
        System.out.println(s);
        return s;
    }


    // 菜单管理  修改菜单
    @GetMapping("/updateMenu")
    public @ResponseBody
    String updateMenu(String umepid, String umename, String umeurl, String umenames) {
        System.out.println("修改菜单");
        System.out.println(umename);
        System.out.println(umeurl);
        System.out.println(umenames);
        System.out.println(umepid);
        boolean b = safetyEducationVideoMapper.updateMenu(umename, umeurl, Integer.valueOf(umepid));
        Gson gson = new Gson();
        String s = gson.toJson(b);
        System.out.println(s);
        return "200";
    }


    // 菜单管理  修改菜单 啊
    @GetMapping("/selectSchool")
    public @ResponseBody
    String selectSchool(String biadtime,String biadtimes,String uname,int page) {
        System.out.println("查询园所审批");
        List<SchoolMessage> schoolMessages = safetyEducationVideoMapper.selectSchool(biadtime,biadtimes,uname,(page - 1) * 5, 5);
        Gson gson = new Gson();
        String s = gson.toJson(schoolMessages);
        System.out.println(s);
        return s;
    }


    @GetMapping("/rePower")
    public @ResponseBody
    String rePower(int meid) {
        System.out.println("权限管理");
        repower = new HashMap<>();
        repower.put("leftList", changeMeans(safetyEducationVideoMapper.selectMenuRight(meid)));
        repower.put("rightList", changeMeans(safetyEducationVideoMapper.selectMenuLeft(meid)));
        String json = gson.toJson(repower);
        return json;
    }


    private List<LayuiBean> changeMeans(List<Menu> list) {
        List<LayuiBean> result = new ArrayList<LayuiBean>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMeid() == 0) {
                LayuiBean menu = new LayuiBean(list.get(i).getMename(), list.get(i).getMepid(), list.get(i).getMeurl());
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getMeid() == list.get(i).getMepid()) {
                        menu.getChildren().add(new LayuiBean(list.get(j).getMename(), list.get(j).getMepid(), list.get(j).getMeurl()));
                    }
                }
                if (!menu.getChildren().isEmpty()) {
                    result.add(menu);
                }
            }
        }
        return result;
    }


    @ResponseBody
    @PostMapping(value = "/addright",produces = {"application/text;charset=UTF-8"})
    public String rePower(@RequestBody String mid, HttpServletRequest req) {
        JsonObject jsonObject = gson.fromJson(mid, JsonObject.class);
        //角色id
        JsonElement roleid1 = jsonObject.get("mid");
        String roleaj = roleid1.getAsString();
        System.out.println(roleaj + "ggggggggggggggggggggggggg");
        //选中id
        JsonElement members = jsonObject.get("pid");
        JsonArray asString = members.getAsJsonArray();
        for (int i = 0; i < asString.size(); i++) {
            System.out.println(Integer.parseInt(asString.get(i).toString()));
            List<Menu> menuList = safetyEducationVideoMapper.isidexit(Integer.parseInt(roleaj), Integer.parseInt(asString.get(i).toString()));
            System.out.println(menuList + "pppppppppppppppppppppppppp");
            if (menuList.size() == 0) {
                if (safetyEducationVideoMapper.insertPower(Integer.parseInt(roleaj), Integer.parseInt(asString.get(i).toString()))) {
                    flag = "200";
                }
            } else {
                flag = "100";
            }
        }
        return flag;
    }


    @PostMapping("/removeleft")
    public @ResponseBody
    String delPower(@RequestBody String roleidleft, HttpServletRequest req) {
        System.out.println(roleidleft);
        JsonObject jsonObject2 = gson.fromJson(roleidleft, JsonObject.class);
        //角色id
        JsonElement roleid2 = jsonObject2.get("roleidleft");
        String roleaj2 = roleid2.getAsString();
        System.out.println(roleaj2);
        //选中id
        JsonElement members = jsonObject2.get("allIDleft");
        JsonArray asString = members.getAsJsonArray();
        for (int i = 0; i < asString.size(); i++) {
            System.out.println(Integer.parseInt(asString.get(i).toString()));
            System.out.println(Integer.parseInt(roleaj2));
            System.out.println(Integer.parseInt(asString.get(i).toString()));

            List<Menu> menuList = safetyEducationVideoMapper.isidexit(Integer.parseInt(roleaj2), Integer.parseInt(asString.get(i).toString()));
            System.out.println(menuList + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
            if (menuList.size() != 0) {
                if (safetyEducationVideoMapper.delPower(Integer.parseInt(roleaj2), Integer.parseInt(asString.get(i).toString()))) {
                    flag = "200";
                }
            } else {
                flag = "100";
            }
        }
        return flag;
    }


    // 禁用
    @GetMapping("/forbidden")
    public @ResponseBody
    String forbidden(String starta,int ID) {
        System.out.println("园所禁用");
        System.out.println(starta);
        if (starta.equals("禁用")){
            starta = "启用";
        }else{
            starta = "禁用";
        }
        System.out.println(ID);
        boolean forbidden = safetyEducationVideoMapper.forbidden(starta, ID);
        return "forbidden";
    }


    // 重置密码
    @GetMapping("/resetpwd")
    public @ResponseBody
    String resetpwd(int ID) {
        System.out.println("重置密码");
        System.out.println(ID);
        boolean resetpwd = safetyEducationVideoMapper.resetpwd(ID);
        return "resetpwd";
    }


    // 删除
    @GetMapping("/delectID")
    public @ResponseBody
    String delectID(int ID) {
        System.out.println("删除");
        System.out.println(ID);
        boolean b = safetyEducationVideoMapper.delectID(ID);
        return "200";
    }

    // 确认修改园所
    @GetMapping("/updateID")
    public @ResponseBody
    String updateID(String schoolname,String schoolacc,int ID) {
        System.out.println("修改园所");
        System.out.println(schoolname);
        System.out.println(schoolacc);
        System.out.println(ID);
        boolean b = safetyEducationVideoMapper.updateID(schoolname,schoolacc,ID);
        return "200";
    }
}
