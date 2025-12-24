package com.example.vsCodeApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.vsCodeApplication.service.vsCodeSVC;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@org.springframework.stereotype.Controller
@RequestMapping("/api_vsCode")

public class Controller {
    @Autowired
    vsCodeSVC codeSVC;

    @GetMapping("/hellooo")
    public String sayHello() {
        return codeSVC.getData().toString();

    }

    @PostMapping("/postEndpointtt")
    public String postMethodName(@RequestBody String requestBody) {
        System.out.println("Received POST request with body: " + requestBody);
        return codeSVC.getData().toString();
    }

    @GetMapping("/hello")
    public String sayHello1() {
        return "Hello";
    }

    @PostMapping("/postEndpoint")
    public String postMethodName() {
        return "Post OK";
    }

}
