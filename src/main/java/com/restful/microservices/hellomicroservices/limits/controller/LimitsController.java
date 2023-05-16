package com.restful.microservices.hellomicroservices.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.microservices.hellomicroservices.limits.bean.Limits;
import com.restful.microservices.hellomicroservices.limits.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
		//hardcode: return new Limits(1, 1000);
	}
}
