package com.springdemo.springlearning;

public class FirstTestingClass {
    private final String myVar;

    public FirstTestingClass(String myVar) {
        this.myVar = myVar;
    } // this is constructor dependency injection

    public String sayHello(){
        return "This is the first test class in springboot + added variable = "+ myVar;
    }
}

