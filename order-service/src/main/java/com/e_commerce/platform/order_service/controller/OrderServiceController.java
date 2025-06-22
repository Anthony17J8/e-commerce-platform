package com.e_commerce.platform.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {

    @GetMapping("/")
    public String getHello() {
        return "Hello World!";
    }
}
