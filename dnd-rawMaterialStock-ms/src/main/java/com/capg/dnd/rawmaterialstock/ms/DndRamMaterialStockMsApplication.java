package com.capg.dnd.rawmaterialstock.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class DndRamMaterialStockMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndRamMaterialStockMsApplication.class, args);
		System.out.println("hello Spring");
	}
	
@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}
	@Bean
	public RawMaterialStock getRawMaterialStock() {
		return new RawMaterialStock();
		
	}
}
