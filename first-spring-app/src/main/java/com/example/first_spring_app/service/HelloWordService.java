package com.example.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
//definir que um classe service para o spring saber

public class HelloWordService {
    public String HelloWorld(String name){
        return "hello video" + name;
    }
}
