package com.nuc.blog.dao;

import com.nuc.blog.entity.EvaluateReply;

public interface EvaluateReplyMapper {
    int deleteByPrimaryKey(Integer replyId);

    int insert(EvaluateReply record);

    int insertSelective(EvaluateReply record);

    EvaluateReply selectByPrimaryKey(Integer replyId);

    int updateByPrimaryKeySelective(EvaluateReply record);

    int updateByPrimaryKey(EvaluateReply record);
}