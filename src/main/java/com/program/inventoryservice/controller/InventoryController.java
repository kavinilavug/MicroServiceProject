package com.program.inventoryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.program.inventoryservice.service.InventorySevice;

@Controller
@RequestMapping("/api")
public class InventoryController {

	@Autowired
	private  InventorySevice inventoryService;
	private boolean res;
	private String response;
	@GetMapping("/inventory/{skucode}")
	public ResponseEntity<String>  isInStock(@PathVariable String skucode) {
		System.out.println("skucode:"+skucode);
		 res=inventoryService.isInStock(skucode);
		System.out.println(res);
		//inventoryResponse.setRes(res);
		if(res==true) {
			response="The stock is available";
		}else {
			response="The stock is not available";
		}
		return new ResponseEntity<String>(response,HttpStatus.ACCEPTED);
	}
}
