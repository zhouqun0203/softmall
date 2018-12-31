package com.gg.api.service.shop;

import com.gg.api.service.common.CommonResponse;

public interface ShopInfoService {

    /**
     * 商铺信息查询By shopId
     *
     * @param shopId
     */
    CommonResponse queryShopInfoByShopId(Long shopId);
}
