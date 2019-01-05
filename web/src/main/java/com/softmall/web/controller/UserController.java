package com.softmall.web.controller;

import com.softmall.api.service.common.CommonResponse;
import com.softmall.core.domain.shop.Shop;
import com.softmall.core.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ShopService shopService;

//    http://127.0.0.1:8080/user/getUserByUserId?userId=123

    @RequestMapping("/getUserByUserId")
    public CommonResponse getUserByUserId(@RequestParam("userId") Long userId) {

        Shop param = new Shop();

        shopService.queryByPage(param);


        return null;
    }


}
