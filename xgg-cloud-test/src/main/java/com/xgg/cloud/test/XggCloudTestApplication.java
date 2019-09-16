package com.xgg.cloud.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class XggCloudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(XggCloudTestApplication.class, args);
	}

	@Slf4j
	@RestController
	static class TestController {

		@GetMapping("/hello")
		public String hello() {
			return "didispace.com";
		}

	}
}
