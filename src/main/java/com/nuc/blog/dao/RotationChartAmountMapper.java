package com.nuc.blog.dao;

import com.nuc.blog.entity.RotationChartAmount;

public interface RotationChartAmountMapper {
    int insert(RotationChartAmount record);

    int insertSelective(RotationChartAmount record);
}