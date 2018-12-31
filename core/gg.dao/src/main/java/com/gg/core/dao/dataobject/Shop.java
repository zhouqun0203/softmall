package com.gg.core.dao.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class Shop {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long sellerId;

    private String shopName;

    private Long areaCode;

    private String addressDetail;

    private String longitude;

    private String latitude;

    private String brandName;

    private String attributes;

    private String status;

}