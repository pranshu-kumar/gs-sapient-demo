package com.sapient.gsdemoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GsdemoeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsdemoeurekaApplication.class, args);
	}

}
