package org.nagarro.aservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import io.swagger.annotations.ApiOperation;

@RestController
public class MainController {
	
	@Autowired
	RestTemplateBuilder restTemplateBuilder;
	
	@Autowired
	EurekaClient eurekaClient;
	
	@ApiOperation(value = "show Location", notes = "show b-services Instance")
	@GetMapping("/getmap")
	public String getLocation() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo nextServerFromEureka =  eurekaClient.getNextServerFromEureka("B-SERVICE", false);
		String baseUrl = nextServerFromEureka.getHomePageUrl(); //http://localhost:port
		
		return restTemplate.getForObject(baseUrl+"/location", String.class);
		
	}
}