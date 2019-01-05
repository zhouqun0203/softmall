package com.softmall.core.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.softmall.core.dao.dataobject.ShopDO;
import com.softmall.core.dao.mapper.ShopMapper;
import com.softmall.core.domain.shop.Shop;
import com.softmall.core.shop.service.ShopService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> queryByPage(Shop shop) {
        //PageHelper.startPage(1,10);

        List<ShopDO> shopDOList = shopMapper.selectPagedShops(shop);

        List<Shop> shopList = new ArrayList<>();

        if (shopDOList != null && shopDOList.size() > 0) {
            for (ShopDO shopDO : shopDOList) {
                Shop shop1 = new Shop();
                BeanUtils.copyProperties(shopDO, shop1);
                shopList.add(shop1);
            }
        }


        return shopList;
    }

}
