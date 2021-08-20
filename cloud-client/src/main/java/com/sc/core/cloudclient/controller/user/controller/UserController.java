package com.sc.core.cloudclient.controller.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.sc.core.cloudclient.controller.user.dto.UserInfo;
import com.sc.core.cloudclient.controller.user.service.UserService;
import com.sc.core.cloudclient.util.result.ResultUitl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author YanXin
 * @Date 2021/2/26
 **/
@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUserInfo",method = {RequestMethod.GET})
    @ResponseBody
    public UserInfo getUserInfo(UserInfo userInfo){
        return userService.getUserInfo(userInfo);
    }

    @RequestMapping(value = "/getUserInfoList",method = {RequestMethod.GET})
    @ResponseBody
    public List<UserInfo> getUserInfoList(UserInfo userInfo){
        log.info("interface getUserInfoList 。。。");
        return userService.getUserInfoList(userInfo);
    }

    @RequestMapping(value = "/saveUserInfo",method = {RequestMethod.POST})
    @ResponseBody
    public Object saveUserInfo(@RequestBody UserInfo userInfo){
        userInfo.setCreatedBy("Yx");
        userInfo.setUpdatedBy("Yx");
        log.info("save userInfo = " + JSONObject.toJSONString(userInfo));
        Object object = userService.saveUserInfo(userInfo);
        return object;
    }

}
