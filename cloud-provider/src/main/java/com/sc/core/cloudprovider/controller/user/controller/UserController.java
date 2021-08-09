package com.sc.core.cloudprovider.controller.user.controller;

import com.sc.core.cloudprovider.controller.user.dto.UserInfo;
import com.sc.core.cloudprovider.controller.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author YanXin
 * @Date 2021/2/26
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserInfo", method = {RequestMethod.GET})
    @ResponseBody
    private UserInfo getUserInfo(UserInfo userInfo){
        return userService.getUserInfo(userInfo);
    }

}
