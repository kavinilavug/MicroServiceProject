package com.program.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.program.orderservice.entity.OrderLineItems;
import com.program.orderservice.service.OrderService;

@Controller
@RequestMapping("/api")
public class OrderController {
    @Autowired
	private OrderService orderService;
	@PostMapping("/order")
	public ResponseEntity<OrderLineItems> placeOrder(@RequestBody OrderLineItems orderLineItems) {
		String res=orderService.addOrder(orderLineItems);
		System.out.println("-----"+res);
		return new ResponseEntity<OrderLineItems>(HttpStatus.CREATED);
		
	}
}
