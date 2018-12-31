package com.softmall.api.service.user;

import com.softmall.api.service.common.CommonResponse;
import com.softmall.api.service.user.reponse.UserInfoReponse;

public interface UserInfoService {

    /**
     * 用户信息查询By UserId
     *
     * @param userId
     * @return
     */
    CommonResponse<UserInfoReponse> queryUserInfoByUserId(Long userId);

    /**
     * 用户信息查询By OpenId
     *
     * @param openId
     * @return
     */
    CommonResponse<UserInfoReponse> queryUserInfoByOpenId(String openId);
}
