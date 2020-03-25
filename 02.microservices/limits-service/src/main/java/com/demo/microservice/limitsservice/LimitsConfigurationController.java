package com.demo.microservice.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservice.limitsservice.bean.LimitComfiguration;

@RestController
public class LimitsConfigurationController {
	
	@GetMapping("/limits")
	public LimitComfiguration retrieveLimitsFromConfigurations()
	{
		return new LimitComfiguration(1000,1);
		
	}
}
