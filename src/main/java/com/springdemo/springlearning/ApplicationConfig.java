package com.springdemo.springlearning;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

    @Bean
    @Profile("dev")
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
