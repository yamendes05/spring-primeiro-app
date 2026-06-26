package com.example.first_spring_app.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    @Bean
    public SDKAWS sdkAWS(){
        return new SDKAWS();
    }
}
