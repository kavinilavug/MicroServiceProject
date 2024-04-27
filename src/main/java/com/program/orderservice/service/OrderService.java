package com.program.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.program.orderservice.entity.OrderLineItems;
import com.program.orderservice.model.InventoryResponse;
import com.program.orderservice.repository.OrderRepository;

@Component
public class OrderService {
	@Autowired
	public OrderRepository orderRepository;
	private WebClient.Builder webClientBuilder;
	
	@Autowired
	private InventoryResponse inventoryResponse;

	public String addOrder(OrderLineItems orderLineItems) {
		System.out.println("skucode::" + orderLineItems.getSkucode());
		String result = webClientBuilder.build().get()
				.uri("http://INVENTORY-SERVICE/api/inventory/"+orderLineItems.getSkucode())
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		System.out.println("after inventry sevrice::" + result);
		if (inventoryResponse.isRes() == true) {
			orderRepository.save(orderLineItems);
			System.out.println("Order Placed successfully");
		}else {
			System.out.println("Order Placed not placed and stock is mot available");
		}
		return "Order Placed successfully";
	}
}
