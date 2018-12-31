package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.Offer;

public interface OfferMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Offer record);

    int insertSelective(Offer record);

    Offer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Offer record);

    int updateByPrimaryKeyWithBLOBs(Offer record);

    int updateByPrimaryKey(Offer record);
}