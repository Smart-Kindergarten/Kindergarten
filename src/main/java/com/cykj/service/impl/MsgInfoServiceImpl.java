package com.cykj.service.impl;

import com.cykj.bean.MsgInfo;
import com.cykj.mapper.MsgInfoMapper;
import com.cykj.service.MsgInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 17:02
 * @desc:
 */
@Service
public class MsgInfoServiceImpl implements MsgInfoService {
    @Autowired
    private MsgInfoMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MsgInfo msgInfo) {
        return mapper.insert(msgInfo);
    }

    @Override
    public int insertSelective(MsgInfo msgInfo) {
        return mapper.insertSelective(msgInfo);
    }

    @Override
    public MsgInfo selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MsgInfo msgInfo) {
        return mapper.updateByPrimaryKeySelective(msgInfo);
    }

    @Override
    public int updateByPrimaryKey(MsgInfo msgInfo) {
        return mapper.updateByPrimaryKey(msgInfo);
    }

    @Override
    public List<MsgInfo> select(MsgInfo msgInfo) {
        List<MsgInfo> select = mapper.select(msgInfo);
        if (!select.isEmpty()) {
            return select;
        }
        return null;
    }

    @Override
    public void msgRead(Integer fromUserId, Integer toUserId) {
        mapper.msgRead(fromUserId, toUserId);
    }

    @Override
    public List<MsgInfo> selectMsgList(Integer fromUserId, Integer toUserId) {
        List<MsgInfo> msgInfos = mapper.selectMsgList(fromUserId, toUserId);
        if (msgInfos.isEmpty()) {
            return null;
        }
        return msgInfos;
    }
}
