package com.chovans.model;

import com.chovans.constants.ResultCode;

import java.util.Map;

/**
 * Created by chovans on 2016/12/30.
 */
public class ResultModel {
    private Integer code;
    private String msg;
    private Map<String,Object> data;

    public ResultModel() {
        this.code = ResultCode.SUCCESS_CODE;
        this.msg = ResultCode.SUCCESS_MSG;
    }

    public ResultModel(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultModel(Map<String, Object> data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
