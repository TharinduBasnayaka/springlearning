package com.springdemo.springlearning;

public class FirstTestingClass {
    private String myVar;

    public FirstTestingClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "This is the first test class in springboot + added variable = "+ myVar;
    }
}

