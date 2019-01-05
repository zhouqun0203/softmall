package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.TradeOrderDO;

public interface TradeOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TradeOrderDO record);

    int insertSelective(TradeOrderDO record);

    TradeOrderDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TradeOrderDO record);

    int updateByPrimaryKey(TradeOrderDO record);
}