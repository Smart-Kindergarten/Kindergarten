package com.cykj.service;

import com.cykj.bean.SessionList;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 17:08
 * @desc:
 */
public interface SessionListService {
    int deleteByPrimaryKey(Integer id);

    int insert(SessionList sessionList);

    int insertSelective(SessionList sessionList);

    SessionList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SessionList sessionList);

    int updateByPrimaryKey(SessionList sessionList);

    List<Integer> selectUserIdByUserId(Integer id);

    List<SessionList> selectByUserId(Integer id);

    Integer selectIdByUser(Integer fromId, Integer toId);

    SessionList select(SessionList sessionList);

    void addUnReadCount(Integer userId, Integer toUserId);

    void delUnReadCount(Integer fromUserId, Integer toUserId);

}
