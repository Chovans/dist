package com.chovans.util;

import com.alibaba.fastjson.JSON;

/**
 * @author chovans on 15/7/26.
 */
public class JSONUtil {
    private JSONUtil(){}

    public static <T> T parseObject(String json,Class<T> clazz){
        return JSON.parseObject(json, clazz);
    }

    public static String toJSONString(Object object){
        return JSON.toJSONString(object);
    }

}
