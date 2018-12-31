package com.gg.api.domain;

import java.util.Date;

import lombok.Data;

/**
 * @author zhouqun
 */
@Data
public class UserAction {
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