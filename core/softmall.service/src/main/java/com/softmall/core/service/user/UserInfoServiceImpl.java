package com.softmall.core.service.user;

import com.softmall.api.service.common.CommonResponse;
import com.softmall.api.service.user.UserInfoService;
import com.softmall.api.service.user.reponse.UserInfoReponse;
import com.softmall.core.dao.dataobject.UserInfo;
import com.softmall.core.dao.mapper.UserInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户信息服务
 *
 * @author zhouqun
 */
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
    public CommonResponse<UserInfoReponse> queryUserInfoByUserId(Long userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        if (userInfo == null) {
            return CommonResponse.warpFailed("cannot found userInfo!");
        }
        UserInfoReponse userInfoReponse = new UserInfoReponse();
        BeanUtils.copyProperties(userInfo, userInfoReponse);
        return CommonResponse.warpSuccess(userInfoReponse);
    }

    /**
     * 用户信息查询By OpenId
     *
     * @param openId
     */
    @Override
    public CommonResponse<UserInfoReponse> queryUserInfoByOpenId(String openId) {
        UserInfo userInfo = userInfoMapper.selectByOpenId(openId);
        if (userInfo == null) {
            return CommonResponse.warpFailed("cannot found userInfo!");
        }
        return CommonResponse.warpSuccess(userInfo);
    }
}
