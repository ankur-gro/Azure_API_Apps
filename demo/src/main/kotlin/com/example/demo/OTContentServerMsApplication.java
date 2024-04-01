package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OTContentServerMsApplication {

    public static void main(String[] args) {
		SpringApplication.run(OTContentServerMsApplication.class, args);
	}

	@Override
	public String toString() {
		return "OTContentServerMsApplication []";
	}

}
