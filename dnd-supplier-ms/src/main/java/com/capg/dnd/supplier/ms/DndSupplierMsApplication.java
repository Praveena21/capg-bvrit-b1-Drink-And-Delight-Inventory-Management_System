package com.capg.dnd.supplier.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DndSupplierMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndSupplierMsApplication.class, args);
		System.out.println("Supplier ms started");

		
	}
}
