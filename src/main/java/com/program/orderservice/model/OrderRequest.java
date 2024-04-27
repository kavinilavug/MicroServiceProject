package com.program.orderservice.model;

import java.util.List;

public class OrderRequest {
	public List<OrderLineItemsDto> getOrderLineItemsDto() {
		return orderLineItemsDto;
	}

	public void setOrderLineItemsDto(List<OrderLineItemsDto> orderLineItemsDto) {
		this.orderLineItemsDto = orderLineItemsDto;
	}

	private List<OrderLineItemsDto> orderLineItemsDto;
}
