package com.springcloudmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstService")
public class FirstServiceController {

	@GetMapping("/get")
	public String sampleGet() {
		return "I am first Microservice";
		
	}
}
