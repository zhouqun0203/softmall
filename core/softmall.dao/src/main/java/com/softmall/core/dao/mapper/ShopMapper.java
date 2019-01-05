package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.ShopDO;

import java.util.List;

public interface ShopMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShopDO record);

    int insertSelective(ShopDO record);

    ShopDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopDO record);

    int updateByPrimaryKey(ShopDO record);

    List<ShopDO> selectPagedShops(Long id);

}