package com.capg.dnd.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DndEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndEurekaServerApplication.class, args);
	}

}
