package com.sc.core.cloudclient.controller.user.dao;

import com.sc.core.cloudclient.controller.user.dto.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author YanXin
 * @Date 2021/6/29
 **/
@Mapper
public interface UserDao {

    /**
     * 获取用户信息
     * @param userInfo
     * @return
     */
    UserInfo getUserInfo(UserInfo userInfo);

    /**
     * 获取用户信息列表
     * @param userInfo
     * @return
     */
    List<UserInfo> getUserInfoList(UserInfo userInfo);

    /**
     * 新增用户信息
     * @param userInfo
     */
    void addUserInfo(UserInfo userInfo);

}
