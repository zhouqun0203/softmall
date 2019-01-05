package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.MarketCenterDO;

public interface MarketCenterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MarketCenterDO record);

    int insertSelective(MarketCenterDO record);

    MarketCenterDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MarketCenterDO record);

    int updateByPrimaryKey(MarketCenterDO record);
}