package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getGreeting() {
        return "This is a test for Ewuji Oluwaseyi John. Updating it using CI/CD pipeline & k8s";
    }
}
