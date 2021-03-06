package com.softmall.core.dao.dataobject;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhouqun
 */
@Data
public class TradeOrderDO {
    private Integer id;

    private Long bizOrderId;

    private Long sellerId;

    private String sellerNickName;

    private Long buyerId;

    private String buyerNickName;

    private String isMain;

    private String isDetail;

    private Date gmtCreate;

    private Date gmtPaid;

    private Date gmtEnd;

    private Date gmtSend;

    private Integer itemQuantity;

    private BigDecimal itemPrice;

    private BigDecimal itemAmount;

    private Long itemId;

    private String itemTitle;

    private BigDecimal actualPaidFee;

    private BigDecimal postFee;

    private BigDecimal discountFee;

    private BigDecimal refundFee;

    private String payStatus;

    private String logisticStatus;

    private String attributes;

    private String status;

}