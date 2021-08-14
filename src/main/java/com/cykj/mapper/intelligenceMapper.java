package com.cykj.mapper;

import com.cykj.bean.SchoolMessage;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/8/10
 * @desc:
 */

@Repository
public interface intelligenceMapper {

    public List<SchoolMessage> selectAll(int page , int pages);

    public boolean update(String type,String EnrolmentTime,int ID);

    public boolean updateAll(String type,String EnrolmentTime,int ID);

    public List<SchoolMessage> select(String applicationDeadline,String applicationDeadlines,String type,String schoolName,int page,int pages);
}
