package com.example.first_spring_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
//Stateless -> acada nova requisição eu recebo todas as informações que preciso fazer aquela funcionanlidade que o cliente está pedindo, statefull -> o estado de cada cliente é mantido no servidar
@RequestMapping("/hello-word")
//end point o que minha classe vai estar recebendo e respondedno
    


public class HelloWorldController {
    @GetMapping
    //responder as requisições GET no endpoint /hello word
   public String helloWorld(){
        return "Hello World";
   }
}
