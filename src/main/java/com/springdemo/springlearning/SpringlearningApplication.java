package com.springdemo.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class SpringlearningApplication {

	public static void main(String[] args) {
//		var app = new SpringApplication(SpringlearningApplication.class);
//		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "dev"));
//		var ctx = app.run(args);

		var context = SpringApplication.run(SpringlearningApplication.class, args);

		FirstTestingService firstTestingService = context.getBean(FirstTestingService.class);
		System.out.println(firstTestingService.loadBeanFromClass());
		System.out.println(firstTestingService.readFromTheApplicationProperties());
		System.out.println(firstTestingService.getCustomPropertyFromAnotherFile());
	}


}
