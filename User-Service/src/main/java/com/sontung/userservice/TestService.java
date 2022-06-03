package com.sontung.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Value("${test.name}")
    private String test;

    public void printString(){
        System.out.println(test);
    }
}
