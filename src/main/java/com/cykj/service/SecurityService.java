package com.cykj.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/23 17:26
 * @desc: 安保端后端接口
 */
@Service
public interface SecurityService {
    public ResponseEntity<byte[]> getLogo(String Carousel);
}
