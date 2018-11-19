package com.springdemo.dto;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> extends BaseResponse {

    private T data;// 成功时返回的数据

    public Result() {
    }

    public Result(int status, String message) {
        super(status,message);
    }

    public Result data(T data) {
        this.setData(data);
        return this;
    }

    public Result(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
