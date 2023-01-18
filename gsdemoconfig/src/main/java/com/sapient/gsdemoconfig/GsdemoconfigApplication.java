package com.sapient.gsdemoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GsdemoconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsdemoconfigApplication.class, args);
	}

}
