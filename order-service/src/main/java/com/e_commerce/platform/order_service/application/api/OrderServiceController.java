package com.e_commerce.platform.order_service.application.api;

import com.e_commerce.platform.order_service.application.api.request.CreateOrderRequest;
import com.e_commerce.platform.order_service.application.api.response.OrderCreatedResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class OrderServiceController {

    @PostMapping("/orders")
    public ResponseEntity<OrderCreatedResponse> createOrder(@RequestBody CreateOrderRequest request) {
       return ResponseEntity.ok(new OrderCreatedResponse());
    }
}
