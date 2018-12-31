package com.gg.api.service.user;

import com.gg.api.service.common.CommonResponse;

public interface UserInfoService {

    /**
     * 用户信息查询By UserId
     *
     * @param userId
     */
    CommonResponse queryUserInfoByUserId(Long userId);

    /**
     * 用户信息查询By OpenId
     *
     * @param openId
     */
    CommonResponse queryUserInfoByOpenId(String openId);
}
