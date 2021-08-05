package com.cykj.controller;

import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.cykj.config.AlipayConfig;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Alipay
 * @Description: PC版支付宝缴费
 * @Author: BWL
 * @Date: 2021/7/26
 */

@RestController
@Slf4j
public class Alipay {

    Gson gson = new Gson();

    @RequestMapping("/alipay")
    public void pay(HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        DefaultAlipayClient client = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json",AlipayConfig.charset,AlipayConfig.alipay_public_key,AlipayConfig.sign_type);
        AlipayTradePagePayRequest alipayTradePagePayRequest = new AlipayTradePagePayRequest();
        Map<String,Object> map = new HashMap<>();
        map.put("out_trade_no",System.currentTimeMillis());
        map.put("product_code","FAST_INSTANT_TRADE_PAY");
        map.put("total_amount","0.10");
        map.put("subject","缴学费");
        alipayTradePagePayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayTradePagePayRequest.setNotifyUrl(AlipayConfig.notify_url);
        String string = gson.toJson(map);
        log.info(string);
        alipayTradePagePayRequest.setBizContent(string);
        String body = client.pageExecute(alipayTradePagePayRequest).getBody();
        response.setContentType("text/html;charset=" + AlipayConfig.charset);
        response.getWriter().write(body);
        response.getWriter().flush();
        response.getWriter().close();
    }

}
