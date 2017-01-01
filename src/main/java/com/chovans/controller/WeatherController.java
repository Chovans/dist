package com.chovans.controller;

import com.alibaba.fastjson.JSON;
import com.chovans.model.ResultModel;
import com.chovans.util.JSONUtil;
import com.chovans.util.NetUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by chovans on 2016/12/30.
 */
@RestController
public class WeatherController {
    @Value("${weather.api}")
    public String api;
    @Value("${weather.appKey}")
    public String key;

    @RequestMapping(value = "/getWeather")
    public ResultModel getWeather(String lon,String lat){
        String data = NetUtils.sendGet(api, new HashMap() {{
            put("lon", lon);
            put("lan", lat);
            put("dtype", "json");
            put("key", key);
        }});
        return new ResultModel(new HashMap(){{
            put("weather", JSON.parse(data));
        }});
    }
}
