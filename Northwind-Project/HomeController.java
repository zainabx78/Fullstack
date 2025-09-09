package com.sparta.northwind.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")


public class HomeController {
    public ResponseEntity <Void> redirectToSwagger(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/swagger-ui-html");
        return ResponseEntity.status(HttpStatus.FOUND).headers(headers).build();
    }
}
