package com.zlf.error;

import com.zlf.basis.AppCode;
import com.zlf.basis.StatusCode;
import lombok.Getter;

@Getter
public class AppException extends RuntimeException{

    private int code;
    private String msg;

    public AppException(StatusCode statusCode,String message){
        super(message);
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public AppException(String message){
        super(message);
        this.code = AppCode.APP_ERROR.getCode();
        this.msg = AppCode.APP_ERROR.getMsg();
    }

}
