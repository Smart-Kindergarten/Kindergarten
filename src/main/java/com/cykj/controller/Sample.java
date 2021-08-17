package com.cykj.controller;


import com.alibaba.fastjson.JSON;
import com.aliyun.tea.*;
import com.aliyun.ocr20191230.*;
import com.aliyun.ocr20191230.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;

import java.util.HashMap;

public class Sample {

    /**
     * 使用AK&SK初始化账号Client
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.ocr20191230.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId("LTAI5tJcQVXaVChSQfE1NTMJ")
                // 您的AccessKey Secret
                .setAccessKeySecret("zOnnj8KFW3VKf8kGtphfui9U5zuiHR");
        // 访问的域名
        config.endpoint = "ocr.cn-shanghai.aliyuncs.com";
        return new com.aliyun.ocr20191230.Client(config);
    }

    public static String LicensePlate(String url){
        try {
            com.aliyun.ocr20191230.Client client = Sample.createClient("accessKeyId", "accessKeySecret");
            RecognizeBusinessLicenseRequest recognizeBusinessLicenseRequest = new RecognizeBusinessLicenseRequest()
                    .setImageURL(url);
            // 复制代码运行请自行打印 API 的返回值
            String add = client.recognizeBusinessLicense(recognizeBusinessLicenseRequest).getBody().data.address;
            String business = client.recognizeBusinessLicense(recognizeBusinessLicenseRequest).getBody().data.business;
            String name = client.recognizeBusinessLicense(recognizeBusinessLicenseRequest).getBody().data.name;
            String legalPerson = client.recognizeBusinessLicense(recognizeBusinessLicenseRequest).getBody().data.legalPerson;
            HashMap hashMap = new HashMap();
            hashMap.put("add",add);
            hashMap.put("business",business);
            hashMap.put("name",name);
            hashMap.put("legalPerson",legalPerson);
            String msg = JSON.toJSONString(hashMap);
            System.out.println(msg);
            return msg;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
