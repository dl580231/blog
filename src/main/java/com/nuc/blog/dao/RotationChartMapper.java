package com.nuc.blog.dao;

import com.nuc.blog.entity.RotationChart;

public interface RotationChartMapper {
    int deleteByPrimaryKey(Integer chartId);

    int insert(RotationChart record);

    int insertSelective(RotationChart record);

    RotationChart selectByPrimaryKey(Integer chartId);

    int updateByPrimaryKeySelective(RotationChart record);

    int updateByPrimaryKey(RotationChart record);
}