package com.dp.qf.utils;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class Result<T> {
    private int  status;
    private String message;
    private T Data;

    /**
     * 正确时返回的方法
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setStatus(200);
        result.setMessage("success");
        result.setData(object);
        return  result;
    }

    /**
     * 错误时返回的方法
     * @return
     */
    public static Result error(){
        Result result = new Result();
        result.setMessage("error");
        result.setStatus(404);
        return result;
    }

}
