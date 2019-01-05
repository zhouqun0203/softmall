package com.softmall.core.dao.mapper;

import com.softmall.core.dao.dataobject.UserInfoDO;

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
    int insert(UserInfoDO record);

    /**
     * 新增用户
     *
     * @param record
     * @return
     */
    int insertSelective(UserInfoDO record);

    /**
     * 根据主键userId进行查询
     *
     * @param userId
     * @return
     */
    UserInfoDO selectByPrimaryKey(Long userId);

    /**
     * 根据主键userId进行查询
     *
     * @param openId
     * @return
     */
    UserInfoDO selectByOpenId(String openId);

    /**
     * 根据主键更新用户信息
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UserInfoDO record);

    /**
     * 根据主键更新用户信息
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(UserInfoDO record);
}