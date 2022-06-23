package com.mask.auth.exception;

/**
 * @author mask
 * @since 2022/6/19 15:43
 */
public class EnvKyAuthenticationException extends RuntimeException {
    public EnvKyAuthenticationException() {
    }

    public EnvKyAuthenticationException(String message) {
        super(message);
    }

    public EnvKyAuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public EnvKyAuthenticationException(Throwable cause) {
        super(cause);
    }
}
