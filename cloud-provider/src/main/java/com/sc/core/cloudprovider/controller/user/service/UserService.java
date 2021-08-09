package com.sc.core.cloudprovider.controller.user.service;

import com.sc.core.cloudprovider.controller.user.dto.UserInfo;

/**
 * @Author YanXin
 * @Date 2021/2/26
 **/
public interface UserService {

    /**
     * 获取用户信息
     * @param userInfo
     */
    public UserInfo getUserInfo(UserInfo userInfo);

}
