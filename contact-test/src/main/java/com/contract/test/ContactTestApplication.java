package com.contract.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ContactTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactTestApplication.class, args);
	}

}
