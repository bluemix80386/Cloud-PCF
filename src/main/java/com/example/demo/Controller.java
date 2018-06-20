package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/cloud")
public class Controller {
	
	@RequestMapping("/pcf")
	public String pivotalCloud() {
		return "Welcome to pivotal cloud foundry connected ...........";
	}

}
