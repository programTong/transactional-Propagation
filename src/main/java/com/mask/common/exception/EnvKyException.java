package com.mask.common.exception;

import lombok.Getter;

/**
 * @author mask
 * @since 2022/6/19 17:21
 */
@Getter
public class EnvKyException extends RuntimeException {

    /**
     * 返回给前台的信息
     */
    private String frontMessage;


    public EnvKyException(String frontMessage) {
        this.frontMessage = frontMessage;
    }

    public EnvKyException(String message, String frontMessage) {
        super(message);
        this.frontMessage = frontMessage;
    }

    public EnvKyException(String message, Throwable cause, String frontMessage) {
        super(message, cause);
        this.frontMessage = frontMessage;
    }

    public EnvKyException(Throwable cause, String frontMessage) {
        super(cause);
        this.frontMessage = frontMessage;
    }
}
