package com.cykj.mapper;

import com.cykj.bean.PublishHomework;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 19:23
 * @desc: 发布作业
 */

@Repository
public interface P_HMapper {
    int insertAll(PublishHomework publishHomework);

}
