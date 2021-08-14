package com.cykj.service.impl;

import com.cykj.bean.SchoolMessage;
import com.cykj.mapper.intelligenceMapper;
import com.cykj.service.intelligenceSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/8/10
 * @desc:
 */

@Service
@Controller
@RequestMapping("/intelligence")
public class intelligenceImpl implements intelligenceSerice {

    @Autowired
    private intelligenceMapper intelligenceMapper;


    @Override
    public List<SchoolMessage> selectAll(int page, int pages) {
        List<SchoolMessage> list = intelligenceMapper.selectAll(page, pages);

        return list;
    }

    @Override
    public boolean update(String type,String EnrolmentTime,int ID) {
        boolean b = intelligenceMapper.update(type,EnrolmentTime,ID);
        return b;
    }

    @Override
    public boolean updateAll(String type, String EnrolmentTime, int ID) {
        boolean b = intelligenceMapper.updateAll(type, EnrolmentTime, ID);
        return b;
    }

    @Override
    public List<SchoolMessage> select(String applicationDeadline,String applicationDeadlines,String type,String schoolName,int page,int pages) {
        List<SchoolMessage> list = intelligenceMapper.select(applicationDeadline, applicationDeadlines, type, schoolName, page, pages);
        return list;
    }
}
