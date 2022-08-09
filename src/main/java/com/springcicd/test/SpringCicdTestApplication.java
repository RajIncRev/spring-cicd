package com.springcicd.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCicdTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCicdTestApplication.class, args);
		System.out.println("Application starts");
	}

}
