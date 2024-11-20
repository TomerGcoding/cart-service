package eda.ex1.cartservice.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import eda.ex1.cartservice.model.Order;
import org.springframework.amqp.rabbit.connection.RabbitAccessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CartServiceController {


    @PostMapping("/create-order")
    public void createOrder(@RequestParam String orderId,@RequestParam Integer numOfItems){
        //create order
        Order order = new Order(orderId,numOfItems);
        //publish order to rabbitmq
    }
}
