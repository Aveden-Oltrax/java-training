package com.einfochips.demospringmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoSpringMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringMongoDbApplication.class, args);
	}

}
