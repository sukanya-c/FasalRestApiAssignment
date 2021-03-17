package com.fasal.utils;

public class Constants {
    private Constants() {}

    public static final String BASEURL = "https://reqres.in/";
    public static final String REGISTER_SUCCESSFUL_API = "/api/register";
    public static final String CREATE_API = "/api/users";
    public static final String  SINGLE_USER_API = "/api/users/2";
    public static final String  LIST_USERS_API = "/api/users?page=2";
    public static final String  UPDATE_API = "/api/users/2";
    public static final String  DELETE_API = "/api/users/2";
    public static final int SUCCESS_CODE = 200;
    public static final int CREATED_SUCCESS_CODE = 201;
    public static final int NO_CONTENT_CODE = 204;
}
