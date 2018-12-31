package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.MarketCenter;

public interface MarketCenterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MarketCenter record);

    int insertSelective(MarketCenter record);

    MarketCenter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MarketCenter record);

    int updateByPrimaryKey(MarketCenter record);
}