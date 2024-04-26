package com.program.inventoryservice.entity;

import org.springframework.stereotype.Component;

@Component
public class InventoryResponse {

	private boolean res;

	public boolean isRes() {
		return res;
	}

	public void setRes(boolean res) {
		this.res = res;
	}
}
