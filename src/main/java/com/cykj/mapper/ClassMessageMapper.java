package com.cykj.mapper;

import com.cykj.bean.ClassMessage;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/9 23:34
 * @desc:
 */
@Repository
public interface ClassMessageMapper {
    List<ClassMessage> selectAll(int classId);

    int insertClassMessage(ClassMessage classMessage);
}
