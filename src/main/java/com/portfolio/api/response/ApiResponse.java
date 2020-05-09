package com.portfolio.api.response;

public class ApiResponse<T> {
    private int codeResponse;
    private String message;
    private String comment;
    private T data;

    public ApiResponse() {
        this.codeResponse = 99;
        this.message = "ERROR";
        this.comment = "No available information";
    }

    public ApiResponse(int codeResponse, String message, String comment) {
        this.codeResponse = codeResponse;
        this.message = message;
        this.comment = comment;
    }

    public int getCodeResponse() {
        return codeResponse;
    }

    public void setCodeResponse(int codeResponse) {
        this.codeResponse = codeResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "codeResponse=" + codeResponse +
                ", message='" + message + '\'' +
                ", comment='" + comment + '\'' +
                ", data=" + data +
                '}';
    }
}
