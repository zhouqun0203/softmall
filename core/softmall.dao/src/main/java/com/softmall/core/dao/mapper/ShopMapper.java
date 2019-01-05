package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.ShopDO;

import java.util.List;

public interface ShopMapper {
    int deleteByPrimaryKey(Long query);

    int insert(ShopDO insert);

    int insertSelective(ShopDO insert);

    ShopDO selectByPrimaryKey(Long query);

    int updateByPrimaryKeySelective(ShopDO update);

    int updateByPrimaryKey(ShopDO update);

    List<ShopDO> selectPagedShops(ShopDO query);

}