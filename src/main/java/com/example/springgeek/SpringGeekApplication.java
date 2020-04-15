package com.example.springgeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.springgeek")
public class SpringGeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGeekApplication.class, args);
	}

}
