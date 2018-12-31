package com.gg.core.dao.mapper;

import com.gg.core.dao.dataobject.UserInfo;

/**
 * @author zhouqun
 */
public interface UserInfoMapper {
    /**
     * 根据主键userId进行删除
     *
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * 新增用户
     *
     * @param record
     * @return
     */
    int insert(UserInfo record);

    /**
     * 新增用户
     *
     * @param record
     * @return
     */
    int insertSelective(UserInfo record);

    /**
     * 根据主键userId进行查询
     *
     * @param userId
     * @return
     */
    UserInfo selectByPrimaryKey(Long userId);

    /**
     * 根据主键userId进行查询
     *
     * @param openId
     * @return
     */
    UserInfo selectByOpenId(String openId);

    /**
     * 根据主键更新用户信息
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * 根据主键更新用户信息
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(UserInfo record);
}