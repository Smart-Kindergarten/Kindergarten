package com.cykj.service.impl;

import com.cykj.bean.*;
import com.cykj.mapper.AlertlogMapper;
import com.cykj.mapper.LoginMapper;
import com.cykj.mapper.PickMapper;
import com.cykj.mapper.SerializeMapper;
import com.cykj.service.SecurityService;
import com.cykj.va.SecurityMenuVa;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;   

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpUtils;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/23 22:23
 * @desc: 安保员端后端实现类
 */
@Service
public class SecurityServicelmpl implements SecurityService {
    @Autowired
    private SerializeMapper serializeMapper;
    @Autowired
    private PickMapper pickMapper;
    @Autowired
    private AlertlogMapper alertlogMapper;
    public ResponseEntity<byte[]> getLogo(String Carousel) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] bytesByStream = new byte[3072];
        try {
            InputStream inputStream = new DataInputStream(new FileInputStream(new File(System.getProperty("user.dir")+"/image/Carousel/jpeg"+Carousel+".jpeg")));
            int b;
            byteArrayOutputStream = new ByteArrayOutputStream();
            while((b = inputStream.read(bytesByStream)) != -1){

                byteArrayOutputStream.write(bytesByStream,0,b);
            }
        } catch (IOException e) {
            System.out.println("无此图片");
        }
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        return new ResponseEntity<>(byteArrayOutputStream.toByteArray(),headers, HttpStatus.OK);
    }

    @Override
    public List<SecurityMenuVa> getMenu(String UserID) {
        return null;
    }

    /**
     * 视频流
     * @param request Http输入流
     * @param response Http输出流
     * @param mp4 需要播放的视频名称
     * 前端请已此形式访问
     * <video controls="autoplay"    src="http://localhost:9900/Security/GetVideo?mp4=视频名（不带后缀）" />
     *
     * 如
     * <video controls="autoplay"    src="http://localhost:9900/Security/GetVideo?mp4=TextMp4(1)" />
     */
    public void getVido(HttpServletRequest request, HttpServletResponse response,String mp4) {
        String file = System.getProperty("user.dir")+"\\image\\mp4\\"+mp4+".mp4";
        try {
            FileInputStream inputStream = new FileInputStream(file);
            byte[] data = new byte[inputStream.available()];
            inputStream.read(data);
            String diskfilename = "final.mp4";
            response.setContentType("video/mp4");
            response.setHeader("Content-Disposition", "attachment; filename=\"" + diskfilename + "\"");
            response.setContentLength(data.length);
            response.setHeader("Content-Range", "" + Integer.valueOf(data.length - 1));
            response.setHeader("Accept-Ranges", "bytes");
            response.setHeader("Etag", "W/\"9767057-1323779115364\"");
            OutputStream os = response.getOutputStream();
            os.write(data);
            //先声明的流后关掉！
            os.flush();
            os.close();
            inputStream.close();

        } catch (Exception e) {

        }
    }

    @Override
    public List<pick> GetPick(String BID) {
        List<pick> picks = pickMapper.GetPick(BID);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        try {
            Date Testdate = sdf.parse("11:59:59");
            Date Testdate1 = sdf.parse("08:30:01");
            Date Testdate2 = sdf.parse("18:00:01");
            if(picks.size() != 0){
                for(pick pick:picks){
                    String[] tiem = pick.getDate().split(" ");
                    pick.setDate(tiem[0]);
                    pick.setTime(tiem[1]);
                    Date date = sdf.parse(pick.getTime());
                    if(Testdate.after(date)){
                        pick.setTimeClass("上午");
                        if(!Testdate1.after(date) && pick.getState().equals("正常")){
                            pick.setState("迟到");
                        }
                    }else{
                        pick.setTimeClass("下午");
                        if(!Testdate2.after(date) && pick.getState().equals("正常")){
                            pick.setState("迟到");
                        }
                    }

                }
                return picks;
            }else{
                return new ArrayList<pick>();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Baby> GetBaby(String Bname, String CID) {
        System.out.println(Bname+":"+CID);
        List<Baby> Babys = pickMapper.GetBaby(Bname,CID);
        if(Babys.size() != 0){
            return Babys;
        }else{
            return new ArrayList<Baby>();
        }
    }

    @Override
    public List<BabyClass> GetBabyClass(String CName) {
        List<BabyClass> BClass = pickMapper.GetBabyClass(CName);
        if(BClass.size() != 0){
            return BClass;
        }else{
            return new ArrayList<BabyClass>();
        }
    }

    @Override
    public List<Alertlog> getAlertlog(String minDate,String maxDate) {
        return pickMapper.getAlertlog(minDate,maxDate);
    }

    @Override
    public List<KBean> getkdata() {
        List<KBean> KBeens = pickMapper.getKName();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(new Date());
        for(KBean kBean : KBeens){
            kBean.setDate(date);
        }
        return KBeens;
    }

    @Override
    public void alert(String serialize) {
        List<Serialize> serializes = serializeMapper.getSerialize(serialize);
        String timeDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        alertlogMapper.insert(serializes.get(0).getBiid(),timeDate);
        ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com",
                "109706", "e2832fff-0ab5-49cb-a30e-7ea1e8ff95da");
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("number", serializes.get(0).getUphone());
        params.put("templateId", "6377");
        String[] templateParams = new String[3];
        templateParams[0] = serializes.get(0).getUname();
        templateParams[1] = serializes.get(0).getBiname();
        templateParams[2] = time;
        params.put("templateParams", templateParams);
        try {
            String result = client.send(params);
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<SecurityGuardUserBen> getSecurityUser(String acc) {
        List<SecurityGuardUserBen> Users =  pickMapper.getSecurityUser(acc);
        for(SecurityGuardUserBen user : Users){
            user.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(new Long(user.getTime()))));
        }
        return Users;
    }

}
