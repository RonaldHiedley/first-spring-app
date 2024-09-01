package com.hiedley.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {



    public String HelloWordService (String name){
        return "Hello Word, i'm " + name;
    }
}
