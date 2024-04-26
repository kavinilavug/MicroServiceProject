package com.program.inventoryservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.inventoryservice.repostitory.InventoryRepostitory;

@Service
public class InventorySevice {
	@Autowired
	private InventoryRepostitory inventoryRepostitory;
	private boolean res;
	public boolean isInStock(String skucode) {
		res = inventoryRepostitory.findBySkucode(skucode).isPresent();
		System.out.println("result from db:" + res);
		return res;
	}

}
