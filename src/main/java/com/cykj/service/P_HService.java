package com.cykj.service;

import com.cykj.bean.PublishHomework;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 20:15
 * @desc:
 */
public interface P_HService {
    //发布作业
    int insertAll(PublishHomework publishHomework);
}
