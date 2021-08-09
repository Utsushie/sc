package com.sc.core.cloudprovider.controller.user.service.impl;

import com.sc.core.cloudprovider.controller.user.dto.UserInfo;
import com.sc.core.cloudprovider.controller.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author YanXin
 * @Date 2021/2/26
 **/
@Service("userService")
public class UserServiceImpl implements UserService{

    @Override
    public UserInfo getUserInfo(UserInfo userInfo) {
        userInfo.setUserId("123");
        userInfo.setUserName("ABC");
        return userInfo;
    }
}
