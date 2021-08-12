package com.cykj.service.impl;

import com.cykj.bean.SessionList;
import com.cykj.mapper.SessionListMapper;
import com.cykj.service.SessionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 17:09
 * @desc:
 */
@Service
public class SessionListServiceImpl implements SessionListService {
    @Autowired
    private SessionListMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SessionList sessionList) {
        return mapper.insert(sessionList);
    }

    @Override
    public int insertSelective(SessionList sessionList) {
        return mapper.insertSelective(sessionList);
    }

    @Override
    public SessionList selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SessionList sessionList) {
        return mapper.updateByPrimaryKeySelective(sessionList);
    }

    @Override
    public int updateByPrimaryKey(SessionList sessionList) {
        return mapper.updateByPrimaryKey(sessionList);
    }

    @Override
    public List<Integer> selectUserIdByUserId(Integer id) {
        List<Integer> integers = mapper.selectUserIdByUserId(id);
        return integers;
    }

    @Override
    public List<SessionList> selectByUserId(Integer id) {
        List<SessionList> sessionLists = mapper.selectByUserId(id);
        return sessionLists;
    }

    @Override
    public Integer selectIdByUser(Integer fromId, Integer toId) {
        return mapper.selectIdByUser(fromId, toId);
    }

    @Override
    public SessionList select(SessionList sessionList) {
        return mapper.select(sessionList);
    }

    @Override
    public void addUnReadCount(Integer userId, Integer toUserId) {
        mapper.addUnReadCount(userId, toUserId);
    }

    @Override
    public void delUnReadCount(Integer fromUserId, Integer toUserId) {
        mapper.delUnReadCount(fromUserId, toUserId);
    }
}
