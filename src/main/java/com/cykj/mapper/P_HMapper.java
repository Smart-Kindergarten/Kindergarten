package com.cykj.mapper;

import com.cykj.bean.PublishHomework;
import com.cykj.va.P_H;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/1 19:23
 * @desc: 发布作业
 */

@Repository
public interface P_HMapper {
    int insertAll(PublishHomework publishHomework);

    List<P_H> selectClassPH(int classId);
}
