package com.softmall.core.shop.service;

import com.softmall.core.domain.shop.Shop;

import java.util.List;

public interface ShopService {

    List<Shop> queryByPage(Shop shop);

}
