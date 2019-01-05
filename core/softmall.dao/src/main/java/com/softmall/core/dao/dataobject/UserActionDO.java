package com.softmall.core.dao.dataobject;

import lombok.Data;

import java.util.Date;

/**
 * @author zhouqun
 */
@Data
public class UserActionDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long userId;

    private String actionType;

    private String outBizId;

    private String comment;

    private String attributes;

    private String status;
}