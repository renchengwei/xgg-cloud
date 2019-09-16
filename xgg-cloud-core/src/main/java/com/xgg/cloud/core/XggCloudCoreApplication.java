package com.xgg.cloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

/**
 *  @author: renchengwei
 *  @Date: 2019-08-25
 *  @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {FeignAutoConfiguration.class})
public class XggCloudCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(XggCloudCoreApplication.class, args);
	}
}
