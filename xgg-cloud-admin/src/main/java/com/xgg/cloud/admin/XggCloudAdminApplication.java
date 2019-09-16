package com.xgg.cloud.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {FeignAutoConfiguration.class})
public class XggCloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(XggCloudAdminApplication.class, args);
	}

}
