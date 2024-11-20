package eda.ex1.cartservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartServiceController {

    @PostMapping("/create-order")
    public String createOrder(@RequestParam String orderId,@RequestParam Integer numOfItems) {
        return "Order created with orderId: " + orderId + " and numOfItems: " + numOfItems;
    }
}
