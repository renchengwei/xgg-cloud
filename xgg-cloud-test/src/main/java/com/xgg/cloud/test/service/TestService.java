package com.xgg.cloud.test.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * @Author: renchengwei
 * @Date: 2019-09-07
 * @Description: TODO
 */
public class TestService {
    @SentinelResource("resource")
    public String hello() {
        return "Hello";
    }
}
