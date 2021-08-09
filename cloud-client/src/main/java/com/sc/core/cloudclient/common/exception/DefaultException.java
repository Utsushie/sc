package com.sc.core.cloudclient.common.exception;

/**
 * @Author YanXin
 * @Date 2021/7/9
 **/
public class DefaultException extends RuntimeException{

    private int code;

    public DefaultException(int code, String message){
        super(message);
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
