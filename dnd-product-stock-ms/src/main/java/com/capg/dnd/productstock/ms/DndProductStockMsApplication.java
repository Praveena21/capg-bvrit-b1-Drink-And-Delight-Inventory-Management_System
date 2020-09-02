package com.capg.dnd.productstock.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.productstock.ms.model.ProductStock;
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class DndProductStockMsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DndProductStockMsApplication.class, args);
		System.out.println("hi project started");
	}

@Bean
@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}
@Bean
public ProductStock getProductStock() {
	return new ProductStock();
	
}

}
