package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.UserActionDO;

public interface UserActionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserActionDO record);

    int insertSelective(UserActionDO record);

    UserActionDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserActionDO record);

    int updateByPrimaryKey(UserActionDO record);
}