package com.sapient.gsdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class GSDemoController {
	
	@Value("${demo.state}")
	String state;
	
	@GetMapping("/hello") 
	public String getHome() {
		log.info("Api /hello called");
		log.info(state);
		return "Hello, World!";
	}
}
