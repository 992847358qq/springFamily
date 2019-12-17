package com.example.springgeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGeekApplication {
	@RequestMapping("/")
	String index(){
		return "Hello Spring Boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringGeekApplication.class, args);
	}

}
