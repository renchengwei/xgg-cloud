package com.xgg.cloud.core.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: renchengwei
 * @Date: 2019-08-31
 * @Description: TODO
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return "abc";
    }
}
