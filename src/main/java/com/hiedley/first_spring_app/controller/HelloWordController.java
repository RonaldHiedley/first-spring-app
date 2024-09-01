package com.hiedley.first_spring_app.controller;

import com.hiedley.first_spring_app.domain.User;
import com.hiedley.first_spring_app.service.HelloWordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
// STATELESS -> (token) a cada nova requisição eu recebo todas informações
// que eu preciso para fazer aquela funcionalidade que o cliente tá pedindo.
// STATEFULL -> o estado de cada cliente é mantido no servidor.
//@Controller
//@ResponseBody
@RequestMapping("/hello-word")
public class HelloWordController {

    private HelloWordService helloWordService;

    public HelloWordController(HelloWordService helloWordService){
        this.helloWordService = helloWordService;
    }

    //post, get, delete, put, patch, options, head
    @GetMapping
    public String helloWord(){
        return helloWordService.HelloWordService("Ronald");
    }
    @PostMapping("/{id}")
    public String helloWordPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello Word "+ filter;
    }
}
