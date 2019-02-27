package com.nuc.blog.dao;

import com.nuc.blog.entity.ReadRecord;

public interface ReadRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(ReadRecord record);

    int insertSelective(ReadRecord record);

    ReadRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(ReadRecord record);

    int updateByPrimaryKey(ReadRecord record);
}