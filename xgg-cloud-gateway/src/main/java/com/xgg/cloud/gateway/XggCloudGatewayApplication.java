package com.xgg.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XggCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(XggCloudGatewayApplication.class, args);
	}

}
