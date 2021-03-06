package com.softmall.core.dao.dataobject;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhouqun
 */
@Data
public class MarketCenterDO {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long itemId;

    private BigDecimal discountFee;

    private Long sellerId;

    private String activityName;

    private Long activityStkCount;

    private Date startTime;

    private Date endTime;

    private String attributes;

    private String status;

}