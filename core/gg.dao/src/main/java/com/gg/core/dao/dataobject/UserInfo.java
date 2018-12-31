package com.gg.core.dao.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String openId;

    private String nickName;

    private String loginId;

    private String userPwd;

    private Integer level;

    private String gender;

    private String imgUrl;

    private String description;

    private String attributes;

}