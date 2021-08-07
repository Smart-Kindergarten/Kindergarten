package com.cykj;


import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class photoTest {
    // OCR webapi 接口地址
    private static final String WEBOCR_URL = "https://webapi.xfyun.cn/v1/service/v1/ocr/business_license";
    // 应用APPID(必须为webapi类型应用,并开通营业执照识别服务,参考帖子如何创建一个webapi应用：http://bbs.xfyun.cn/forum.php?mod=viewthread&tid=36481)
    private static final String APPID = "458fd993";
    // 接口密钥(webapi类型应用开通营业执照识别服务后,控制台--我的应用---营业执照识别---相应服务的apikey)
    private static final String API_KEY = "31cedc636eafad7acb757ef47d7703cd";
    // 引擎类型
    private static final String ENGINE_TYPE = "business_license";
    // 图片地址
    private static final String AUDIO_PATH = "C:\\Users\\10371\\Desktop\\1.jpg";
    /**
     * OCR WebAPI 调用示例程序
     *
     * @param args
     * @throws IOException
     */
    @Test
    public static void main(String[] args) throws IOException {
        dis();
    }

    public static void dis() throws IOException{
        Map<String, String> header = buildHttpHeader();
        byte[] imageByteArray = FileUtil.read(AUDIO_PATH);
        String imageBase64 = new String(Base64.encodeBase64(imageByteArray), "UTF-8");
        String result = HttpUtil.doPost1(WEBOCR_URL, header, "image=" + URLEncoder.encode(imageBase64, "UTF-8"));
        System.out.println("WEB card 接口调用结果：" + result);//错误码链接：https://www.xfyun.cn/document/error-code (code返回错误码时必看)400开头错误码请在接口文档底部查看
    }

    /**
     * 组装http请求头
     */
    private static Map<String, String> buildHttpHeader() throws UnsupportedEncodingException {
        String curTime = System.currentTimeMillis() / 1000L + "";
        String param = "{\"engine_type\":\"" + ENGINE_TYPE + "\"}";
        String paramBase64 = new String(Base64.encodeBase64(param.getBytes("UTF-8")));
        String checkSum = DigestUtils.md5Hex(API_KEY + curTime + paramBase64);
        System.out.println(checkSum);
        Map<String, String> header = new HashMap<String, String>();
        header.put("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        header.put("X-Param", paramBase64);
        header.put("X-CurTime", curTime);
        header.put("X-CheckSum", checkSum);
        header.put("X-Appid", APPID);
        return header;
    }
}

