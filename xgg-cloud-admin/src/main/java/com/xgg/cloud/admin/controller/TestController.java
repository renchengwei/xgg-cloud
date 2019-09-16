package com.xgg.cloud.admin.controller;

import com.xgg.cloud.core.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: renchengwei
 * @Date: 2019-09-01
 * @Description: TODO
 */
@RestController
public class TestController {

    @Reference
    HelloService helloService;

    @RequestMapping("/test")
    public String test() {
        return helloService.hello();
    }
}
