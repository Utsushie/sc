package com.sc.core.cloudclient.util.result;

/**
 * @Author YanXin
 * @Date 2021/6/29
 **/
public enum ResultEnum {

    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(100,"成功"),
    ERROR(900,"错误"),
    USER_NOT_EXIST(1,"用户不存在"),
    USER_IS_EXISTS(2,"用户已存在"),
    DATA_IS_NULL(3,"数据为空"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
