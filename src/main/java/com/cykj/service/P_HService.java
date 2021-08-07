package com.cykj.service;

import com.cykj.bean.PublishHomework;
import com.cykj.va.P_H;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 20:15
 * @desc:
 */
public interface P_HService {
    //发布作业
    int insertAll(PublishHomework publishHomework);

    List<P_H> selectClassPH(int classId);

}
