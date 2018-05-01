package com.gac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ServiceZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulDemoApplication.class, args);
	}
}
