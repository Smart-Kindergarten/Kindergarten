package com.cykj.mapper;

import com.cykj.bean.MsgInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 13:55
 * @desc:
 */
@Repository
public interface MsgInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsgInfo msgInfo);

    int insertSelective(MsgInfo msgInfo);

    MsgInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsgInfo msgInfo);

    int updateByPrimaryKey(MsgInfo msgInfo);

    List<MsgInfo> select(MsgInfo msgInfo);

    void msgRead(@Param("fromUserId") Integer fromUserId, @Param("toUserId") Integer toUserId);

    List<MsgInfo> selectMsgList(@Param("fromUserId") Integer fromUserId,@Param("toUserId") Integer toUserId);
}
