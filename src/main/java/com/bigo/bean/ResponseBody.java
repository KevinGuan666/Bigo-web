package com.bigo.bean;

import com.bigo.constant.HttpStatus;
import org.apache.coyote.Response;

import java.util.HashMap;

public class ResponseBody {

    private int code;

    private String msg;

    private HashMap<String, Object> data;

    public ResponseBody() {}

    public ResponseBody(int code, String msg, HashMap<String, Object> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseBody success() {
        return ResponseBody.success("操作成功");
    }

    public static ResponseBody success(String msg) {
        return ResponseBody.success(msg, null);
    }

    public static ResponseBody success(String msg, HashMap<String, Object> data) {
        return new ResponseBody(HttpStatus.SUCCESS, msg, data);
    }

    public static ResponseBody error(String msg, HashMap<String, Object> data) {
        return new ResponseBody(HttpStatus.ERROR, msg, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
