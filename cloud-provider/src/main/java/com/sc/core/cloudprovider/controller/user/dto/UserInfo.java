package com.sc.core.cloudprovider.controller.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sc.core.cloudprovider.common.dto.PageBean;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author YanXin
 * @Date 2021/2/26
 **/
@Getter
@Setter
@JsonIgnoreProperties({"page","pageSize","start","end","pageType","offset","total","isSync"})
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class UserInfo extends PageBean {

    private String userId;  //用户id
    private String userName;  //用户名称

}
