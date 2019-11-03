package com.example.myapplication.network.base;

public class BaseErrorResponse {
    private BaseResponse error;

    public BaseResponse getError() {
        return error;
    }

    public void setError(String status, String message) {
        this.error.setStatus(status);
        this.error.setMessage(message);
    }
}
