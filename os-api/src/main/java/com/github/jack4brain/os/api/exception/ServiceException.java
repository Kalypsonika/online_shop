package com.github.jack4brain.os.api.exception;

/**
 * @author jack4brain
 */
public class ServiceException extends RuntimeException {

    private String code;

    public ServiceException(String message, String code) {
        super(message);
        this.code = code;
    }

    public ServiceException(String message, String code, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
