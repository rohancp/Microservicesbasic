package org.nagarro.bservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BServiceApplication {

	public static void main(String[] args) {
		System.out.println("Rohan");
		SpringApplication.run(BServiceApplication.class, args);
	}
}
