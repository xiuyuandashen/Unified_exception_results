package com.zlf.error;

import com.zlf.basis.ResultCode;
import com.zlf.basis.ResultVo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


//全局处理异常
@RestControllerAdvice
@Slf4j
public class ControllerExceptionAdvice {

//    private Logger logger = LoggerFactory.getLogger(ControllerExceptionAdvice.class);
    /**
     * 前端数据校验
     * @param e
     * @return
     */
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResultVo MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        log.info(objectError.getDefaultMessage());
        return new ResultVo(ResultCode.VALIDATE_ERROR, objectError.getDefaultMessage());
    }

    @ExceptionHandler(AppException.class)
    public ResultVo AppExceptionHandler(AppException e){
        //记录日志
        log.error(e.getMessage());
        //如果是很重要的问题 发邮件给维护人员


        return new ResultVo(e.getCode(),e.getMsg(),e.getMessage());
    }

}
