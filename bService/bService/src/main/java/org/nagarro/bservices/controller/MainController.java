package org.nagarro.bservices.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Value("${spring.application.name:no name}")
	private String appName;
	
	@Value("${server.port:no port}")
	private String portNumber;
	
	@GetMapping("/location")
	public String getBServiceLocation() {
		return appName + " : " + portNumber;
	}
}
