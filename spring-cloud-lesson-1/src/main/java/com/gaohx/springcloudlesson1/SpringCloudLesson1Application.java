package com.gaohx.springcloudlesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudLesson1Application {

	public static void main(String[] args) {
		SpringApplication context = new SpringApplication(SpringCloudLesson1Application.class);
		context.run(args);
	}

}
