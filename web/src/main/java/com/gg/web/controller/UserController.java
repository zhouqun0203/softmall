package com.gg.web.controller;

import com.gg.api.service.common.CommonResponse;
import com.gg.api.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

//    http://127.0.0.1:8080/user/getUserByUserId?userId=123

    @RequestMapping("/getUserByUserId")
    public CommonResponse getUserByUserId(@RequestParam("userId") Long userId) {
        return userInfoService.queryUserInfoByUserId(userId);
    }


}
