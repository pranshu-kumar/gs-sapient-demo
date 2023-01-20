package com.sapient.gsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsdemoApplication.class, args);
	}

}
