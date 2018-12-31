package com.gg.core.dao.dataobject;

import lombok.Data;

import java.util.Date;

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