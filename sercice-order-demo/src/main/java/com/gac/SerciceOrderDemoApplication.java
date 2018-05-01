package com.gac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient  //服务采用其他注册中心。
@SpringBootApplication
//@EnableEurekaClient基于spring-cloud-netflix。服务采用eureka作为注册中心，使用场景较为单一。
public class SerciceOrderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerciceOrderDemoApplication.class, args);
	}

	@Bean
	@LoadBalanced  //注解表明这个restRemplate开启负载均衡的功能,是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
