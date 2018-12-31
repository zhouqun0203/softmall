package com.gg.core.dao.dataobject;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Offer {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long itemId;

    private Long sellerId;

    private BigDecimal itemPrice;

    private String itemImg;

    private String itemTitle;

    private Long itemStkCount;

    private String attributes;

    private String status;

    private String description;

}