package com.springdemo.dto;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {

    private T data;// 成功时返回的数据

    private String message;// 信息

    private String code; // 返回码

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
