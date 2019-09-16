package com.xgg.cloud.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: renchengwei
 * @Date: 2019-09-09
 * @Description: TODO
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String test() {
        return "hello";
    }
}
