package com.sc.core.cloudclient.controller.user.service.impl;

import com.sc.core.cloudclient.controller.user.dao.UserDao;
import com.sc.core.cloudclient.controller.user.dto.UserInfo;
import com.sc.core.cloudclient.controller.user.service.UserService;
import com.sc.core.cloudclient.util.result.ResultUitl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.List;

/**
 * @Author YanXin
 * @Date 2021/4/1
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserInfo getUserInfo(UserInfo userInfo) {
        return userDao.getUserInfo(userInfo);
    }

    @Override
    public List<UserInfo> getUserInfoList(UserInfo userInfo) {
        List<UserInfo> userList = userDao.getUserInfoList(userInfo);
        return userList;
    }

    @Override
    public Object saveUserInfo(UserInfo userInfo) {
        userDao.addUserInfo(userInfo);
        return ResultUitl.success();
    }
}
