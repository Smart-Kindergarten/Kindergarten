package com.cykj.service;

import org.springframework.http.ResponseEntity;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/23 17:26
 * @desc: 安保端后端接口
 */
public interface SecurityService {
    public ResponseEntity<byte[]> getLogo(String Carousel);
}
