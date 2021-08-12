package com.cykj.mapper;

import com.cykj.bean.SessionList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/12 13:57
 * @desc:
 */
@Repository
public interface SessionListMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SessionList sessionList);

    int insertSelective(SessionList sessionList);

    SessionList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SessionList sessionList);

    int updateByPrimaryKey(SessionList sessionList);

    List<Integer> selectUserIdByUserId(Integer id);

    List<SessionList> selectByUserId(Integer id);

    Integer selectIdByUser(@Param("fromId") Integer fromId, @Param("toId") Integer toId);

    SessionList select(SessionList sessionList);

    void addUnReadCount(@Param("userId") Integer userId, @Param("toUserId") Integer toUserId);

    void delUnReadCount(@Param("fromUserId") Integer fromUserId, @Param("toUserId") Integer toUserId);
}
