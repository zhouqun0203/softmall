package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.Shop;

import java.util.List;

public interface ShopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    List<Shop> selectPagedShops(Long id);

}