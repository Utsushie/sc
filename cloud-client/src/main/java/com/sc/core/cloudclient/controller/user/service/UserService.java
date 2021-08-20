package com.sc.core.cloudclient.controller.user.service;

import com.sc.core.cloudclient.controller.user.dto.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author YanXin
 * @Date 2021/2/26
 **/
@FeignClient(name="cloud-provider",path="/user")
public interface UserService {

    UserInfo getUserInfo(UserInfo userInfo);

    List<UserInfo> getUserInfoList(UserInfo userInfo);

    Object saveUserInfo(UserInfo userInfo);

}
