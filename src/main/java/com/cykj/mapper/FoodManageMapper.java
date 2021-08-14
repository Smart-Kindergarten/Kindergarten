package com.cykj.mapper;

import com.cykj.bean.BabyFood;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: shend
 * @Date: 2021/8/11
 * @desc:
 */
@Repository
public interface FoodManageMapper {

    public List<BabyFood> selectAll(int page , int pages);
}
