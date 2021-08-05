package com.cykj.service.impl;


import com.alibaba.fastjson.JSON;
import com.cykj.bean.BabyFood;
import com.cykj.bean.Healthbean;
import com.cykj.mapper.HealthMapper;
import com.cykj.service.HealthService;
import com.cykj.va.ChildHomeWork;
import com.cykj.va.CurrAndUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName: HealthServiceImpl
 * @Description:
 * @Author: ZW
 * @Date: 2021/7/25
 */
@Service
@Controller
@RequestMapping("/Health")
public class HealthServiceImpl implements HealthService {
    @Autowired
    private HealthMapper healthMapper;

    @Override
    public List<Healthbean> selectHealth(String uaccount, int page, int pages) {
        List<Healthbean> health = healthMapper.selectHealth(uaccount, page, page);
        return health;
    }

    /**
     * @Description: 小程序根据手机查询宝宝体检数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-07-27 15:13
     */
    @Override
    public List<Healthbean> selHeaUphone(String uphone, int page, int pages) {
        return healthMapper.selHeaUphone(uphone, page, pages);
    }

    /**
     * @Description: 小程序根据手机查询宝宝课程表数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 2:03
     */
    @Override
    public List<CurrAndUser> selCurrAndUser(String uphone, int page, int pages) {
        return healthMapper.selCurrAndUser(uphone, page, pages);
    }

    /**
     * @Description: 小程序查询宝宝膳食数据
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 3:24
     */
    @Override
    public List<BabyFood> selBabyFood(int page, int pages) {
        return healthMapper.selBabyFood(page, pages);
    }

    /**
     * @Description: 小程序亲子作业
     * @Param:
     * @Author: BWL
     * @Date: 2021-08-05 5:47
     */
    @Override
    public List<ChildHomeWork> selChildHomeWork(String uphone, int page, int pages) {
        return healthMapper.selChildHomeWork(uphone, page, pages);
    }



    @Override
    public String upFood(String breakFood, String lunch, String dinner, String time) {
        try {
            for (int i=0;i<=2;i++){
                switch (i){
                    case 0:
                        BabyFood babyFood = new BabyFood();
                        String []msg = breakFood.split("!!");
                        String []times = time.split(",");
                        babyFood.setFtime("早餐");
                        babyFood.setFdate(times[0]+"至"+times[1]);
                        babyFood.setFone(msg[0]);
                        babyFood.setFtow(msg[1]);
                        babyFood.setFthree(msg[2]);
                        babyFood.setFfour(msg[3]);
                        babyFood.setFfive(msg[4]);
                        healthMapper.upFood(babyFood);
                        break;
                    case 1:
                        BabyFood babyFood1 = new BabyFood();
                        String []msg1 = breakFood.split("!!");
                        babyFood1.setFtime("中餐");
                        babyFood1.setFone(msg1[0]);
                        babyFood1.setFtow(msg1[1]);
                        babyFood1.setFthree(msg1[2]);
                        babyFood1.setFfour(msg1[3]);
                        babyFood1.setFfive(msg1[4]);
                        healthMapper.upFood(babyFood1);
                        break;
                    case 2:
                        BabyFood babyFood2 = new BabyFood();
                        String []msg2 = breakFood.split("!!");
                        babyFood2.setFtime("晚餐");
                        babyFood2.setFone(msg2[0]);
                        babyFood2.setFtow(msg2[1]);
                        babyFood2.setFthree(msg2[2]);
                        babyFood2.setFfour(msg2[3]);
                        babyFood2.setFfive(msg2[4]);
                        healthMapper.upFood(babyFood2);
                        break;
                }
            }
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }

    }

    @Override
    public String selectFood() {
        List<BabyFood> babyFoods = healthMapper.selectFood();
        String meg = JSON.toJSONString(babyFoods);
        return meg;
    }


    @Override
    public String changeFood(String foodId, String date, String changeFood, String foodType, String time) {
        try {
            BabyFood babyFood = new BabyFood();
            babyFood.setReserve3(changeFood);
            int id = Integer.parseInt(foodId);
//            if (time.equals("")){
//                String []times = time.split(",");
//                babyFood.setFdate(times[0]+"至"+times[1]);
//                babyFood.setFid(id);
//                healthMapper.upFoodTime(babyFood);
//            }
            switch (foodType){
                case "1":
                    babyFood.setFid(id);
                    break;
                case "2":
                    id++;
                    babyFood.setFid(id);
                    break;
                case "3":
                    id+=2;
                    babyFood.setFid(id);
                    break;
            }
            switch (date){
                case "4":
                    babyFood.setReserve2("fone");
                    break;
                case "5":
                    babyFood.setReserve2("ftow");
                    break;
                case "6":
                    babyFood.setReserve2("fthree");
                    break;
                case "7":
                    babyFood.setReserve2("ffour");
                    break;
                case "8":
                    babyFood.setReserve2("ffive");
                    break;
            }
            healthMapper.changeFood(babyFood);
            return "成功";
        }catch (Exception e){
            System.out.println(e);
            return "失败";
        }
    }
}
