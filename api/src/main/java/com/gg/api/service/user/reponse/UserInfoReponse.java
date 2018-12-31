package com.gg.api.service.user.reponse;

import java.util.Date;

import lombok.Data;

/**
 * @author zhouqun
 */
@Data
public class UserInfoReponse {
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