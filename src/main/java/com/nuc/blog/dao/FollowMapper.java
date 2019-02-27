package com.nuc.blog.dao;

import com.nuc.blog.entity.Follow;

public interface FollowMapper {
    int deleteByPrimaryKey(Integer followId);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(Integer followId);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}