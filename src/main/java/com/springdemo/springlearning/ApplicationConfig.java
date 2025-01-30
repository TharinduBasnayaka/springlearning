package com.springdemo.springlearning;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("bean1")
    public FirstTestingClass firstBean(){
        return  new FirstTestingClass("firstBean");
    }

    @Bean
    @Qualifier("bean2")
    public FirstTestingClass secondBean(){
        return  new FirstTestingClass("secondBean");
    }

    @Bean
    @Primary
    public FirstTestingClass thirdBean(){
        return  new FirstTestingClass("thirdBean");
    }

}
