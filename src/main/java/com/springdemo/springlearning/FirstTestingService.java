package com.springdemo.springlearning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstTestingService {
    private final FirstTestingClass firstTestingClass;


    public FirstTestingService(@Qualifier("bean2") FirstTestingClass firstTestingClass) {
        this.firstTestingClass = firstTestingClass;
    }

    public String loadBeanFromClass(){
        return  "this bean is loaded from the "+ firstTestingClass.sayHello();
    }

}
