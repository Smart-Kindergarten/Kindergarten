package com.cykj.service;

import com.cykj.bean.MsgInfo;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 17:02
 * @desc:
 */
public interface MsgInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(MsgInfo msgInfo);

    int insertSelective(MsgInfo msgInfo);

    MsgInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsgInfo msgInfo);

    int updateByPrimaryKey(MsgInfo msgInfo);

    List<MsgInfo> select(MsgInfo msgInfo);

    void msgRead(Integer fromUserId, Integer toUserId);

    List<MsgInfo> selectMsgList(Integer fromUserId, Integer toUserId);
}
