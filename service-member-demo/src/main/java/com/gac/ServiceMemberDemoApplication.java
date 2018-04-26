package com.gac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceMemberDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMemberDemoApplication.class, args);
	}
}
