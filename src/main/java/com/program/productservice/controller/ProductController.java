package com.program.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.program.productservice.entity.Product;
import com.program.productservice.service.ProductService;

@Controller
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService proService;

	@PostMapping("/product")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		proService.addProduct(product);
		return new ResponseEntity<Product>(HttpStatus.CREATED);
		
	}

	@GetMapping("/product/{proid}")
	public Optional<Product> getProduct(@PathVariable int productId) {
		Optional<Product> pro = proService.getSpecificProduct(productId);
		return pro;
	}

	@GetMapping("/product")
	ResponseEntity<List<Product>> getListOfProduct() {
		List<Product> emp = proService.readListOfProduct();
		 System.out.println("pro"+emp);
		return new ResponseEntity<List<Product>>(emp,HttpStatus.ACCEPTED);
	}
}
