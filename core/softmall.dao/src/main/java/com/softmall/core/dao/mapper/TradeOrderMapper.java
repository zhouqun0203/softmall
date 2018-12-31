package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.TradeOrder;

public interface TradeOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TradeOrder record);

    int insertSelective(TradeOrder record);

    TradeOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TradeOrder record);

    int updateByPrimaryKey(TradeOrder record);
}