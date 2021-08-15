package com.cykj.mapper;

import com.cykj.bean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: xingyan
 * @date: 2021/7/30 20:52
 * @desc:
 */
@Repository
public interface PickMapper {

    public List<pick> GetPick(@Param("BID")String BID);
    public List<Baby> GetBaby(@Param("Bname")String Bname,@Param("CID")String CID);
    public List<BabyClass> GetBabyClass(@Param("CName")String CName);
    public List<Alertlog> getAlertlog(@Param("minDate") String minDate,@Param("maxDate")String maxDate);
    public List<KBean> getKName();
    public List<SecurityGuardUserBen> getSecurityUser(String acc);
}
