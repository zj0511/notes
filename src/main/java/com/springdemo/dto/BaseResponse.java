package com.springdemo.dto;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class BaseResponse {
    private int status = 200;
    private String message;

    public BaseResponse() {
    }

    public BaseResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
