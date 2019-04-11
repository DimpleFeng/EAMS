package com.dimple.common.exception;

/**
 * @className: BusinessException
 * @description: 业务异常
 * @auther: Dimple
 * @Date: 2019/3/2
 * @Version: 1.0
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    protected final String message;

    public BusinessException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}