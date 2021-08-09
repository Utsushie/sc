package com.sc.core.cloudclient.common.exception;

import com.sc.core.cloudclient.util.result.Result;
import com.sc.core.cloudclient.util.result.ResultUitl;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author YanXin
 * @Date 2021/7/9
 **/
@ControllerAdvice
public class NullException {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result userNull(Exception e){
        if(e instanceof DefaultException){
            DefaultException defaultException = (DefaultException) e;
            return ResultUitl.error(defaultException.getCode(), defaultException.getMessage());
        }else{
            return ResultUitl.error(-1,"未知错误");
        }
    }

}
