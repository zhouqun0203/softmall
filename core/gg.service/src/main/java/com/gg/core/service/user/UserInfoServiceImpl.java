package com.gg.core.service.user;

import com.gg.api.service.common.CommonResponse;
import com.gg.api.service.user.UserInfoService;
import com.gg.core.dao.dataobject.UserInfo;
import com.gg.core.dao.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 用户信息查询By UserId
     *
     * @param userId
     */
    @Override
    public CommonResponse queryUserInfoByUserId(Long userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        if (userInfo == null) {
            return CommonResponse.warpFailed("cannot found userInfo!");
        }
        return CommonResponse.warpSuccess(userInfo);
    }

    /**
     * 用户信息查询By OpenId
     *
     * @param openId
     */
    @Override
    public CommonResponse queryUserInfoByOpenId(String openId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1L);
        if (userInfo == null) {
            return CommonResponse.warpFailed("cannot found userInfo!");
        }
        return CommonResponse.warpSuccess(userInfo);
    }
}
