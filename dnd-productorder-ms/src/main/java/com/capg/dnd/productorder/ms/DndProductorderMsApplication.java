package com.capg.dnd.productorder.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class DndProductorderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndProductorderMsApplication.class, args);
	   System.out.println("hello world");
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}
}
