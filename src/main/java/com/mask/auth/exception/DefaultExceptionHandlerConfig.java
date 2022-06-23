package com.mask.auth.exception;

import com.mask.common.exception.EnvKyException;
import com.mask.common.model.ResultCode;
import com.mask.common.model.ResultMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author mask
 * @since 2022/6/19 17:02
 */
@RestControllerAdvice
@Slf4j
public class DefaultExceptionHandlerConfig {


    @ExceptionHandler(value = Exception.class)
    public ResultMsg exception(Exception e) {
        log.error(e.getMessage(),e);
        return new ResultMsg(ResultCode.ERROR.getCode(), ResultCode.ERROR.getMsg(),null);
    }

    @ExceptionHandler(value = EnvKyException.class)
    public ResultMsg envKyException(EnvKyException e) {
        log.error(e.getMessage(),e);
        return new ResultMsg(ResultCode.ERROR.getCode(), e.getFrontMessage(),null);
    }

}
