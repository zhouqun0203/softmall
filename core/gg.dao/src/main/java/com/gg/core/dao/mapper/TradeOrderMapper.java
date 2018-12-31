package com.gg.core.dao.mapper;

import com.gg.core.dao.dataobject.TradeOrder;

public interface TradeOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TradeOrder record);

    int insertSelective(TradeOrder record);

    TradeOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TradeOrder record);

    int updateByPrimaryKey(TradeOrder record);
}