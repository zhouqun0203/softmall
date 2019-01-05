package com.softmall.core.dao.dataobject;

import lombok.Data;

@Data
public class BaseDO {
    private int pageNum = 0;

    private int pageSize = 10;
}
