package com.springdemo.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringlearningApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringlearningApplication.class, args);

		FirstTestingService firstTestingService = context.getBean(FirstTestingService.class);
		System.out.println(firstTestingService.loadBeanFromClass());
	}


}
