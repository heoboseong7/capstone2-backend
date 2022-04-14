package com.example.capstone2.common.entity;

public enum StatusEnum {

    OK(200, "OK"),
    BAD_REQUEST(400, "BAD_REQUEST"),
    PARAMETER_LACKED(4001, "PARAMETER_LACKED"),

    UNAUTHORIZED(401, "UNAUTHORIZED"),
    UNMATCH(402, "UNMATCH"),
    NOT_FOUND(404, "NOT_FOUND"),

    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR");


    int statusCode;
    String code;

    StatusEnum(int statusCode, String code) {
        this.statusCode = statusCode;
        this.code = code;
    }
}
