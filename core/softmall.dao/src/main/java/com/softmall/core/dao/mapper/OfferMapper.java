package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.OfferDO;

public interface OfferMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OfferDO record);

    int insertSelective(OfferDO record);

    OfferDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OfferDO record);

    int updateByPrimaryKeyWithBLOBs(OfferDO record);

    int updateByPrimaryKey(OfferDO record);
}