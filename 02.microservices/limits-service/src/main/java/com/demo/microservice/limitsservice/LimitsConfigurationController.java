package com.demo.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservice.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {

		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

	@GetMapping("/fault-tolerance-example")
	//@HystrixCommand(fallbackMethod = "fallbackretrieveLimitsConfigurations")
	public LimitConfiguration retrieveLimitsConfigurations() {
		
		throw new RuntimeException();
	}
	
	public LimitConfiguration fallbackretrieveLimitsConfigurations() {
		return new LimitConfiguration(999,9);
	}

}
