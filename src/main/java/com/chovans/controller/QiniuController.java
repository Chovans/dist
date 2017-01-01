package com.chovans.controller;

import com.chovans.model.ResultModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 七牛控制器
 * Created by chovans on 2016/12/30.
 */

@RestController
public class QiniuController {

    @RequestMapping(value = "/getToken")
    public ResultModel getToken(){
        return new ResultModel();
    }
}
