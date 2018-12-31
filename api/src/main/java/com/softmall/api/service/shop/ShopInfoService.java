package com.softmall.api.service.shop;

import com.softmall.api.service.common.CommonResponse;

public interface ShopInfoService {

    /**
     * 商铺信息查询By shopId
     *
     * @param shopId
     */
    CommonResponse queryShopInfoByShopId(Long shopId);
}
