package com.cykj.mapper;

import com.cykj.bean.Baby;
import com.cykj.bean.BabyClass;
import com.cykj.bean.pick;
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
}
