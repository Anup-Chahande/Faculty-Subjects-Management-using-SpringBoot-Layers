package com.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class LiveProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(LiveProject1Application.class, args);
	}

}
