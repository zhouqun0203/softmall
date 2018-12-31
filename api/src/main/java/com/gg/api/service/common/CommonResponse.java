package com.gg.api.service.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static CommonResponse warpSuccess(Object data) {
        CommonResponse commonResponse = new CommonResponse(0, "success");
        commonResponse.setData(data);
        return commonResponse;
    }

    public static CommonResponse warpFailed(Integer code, String message) {
        CommonResponse commonResponse = new CommonResponse(code, message);
        return commonResponse;
    }

    public static CommonResponse warpFailed(String message) {
        CommonResponse commonResponse = new CommonResponse(-1, message);
        return commonResponse;
    }

}
