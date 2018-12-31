package com.gg.core.dao.mapper;

import com.gg.core.dao.dataobject.UserAction;

public interface UserActionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAction record);

    int insertSelective(UserAction record);

    UserAction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAction record);

    int updateByPrimaryKey(UserAction record);
}