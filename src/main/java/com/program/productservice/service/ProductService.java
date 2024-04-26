package com.program.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.program.productservice.entity.Product;
import com.program.productservice.repository.ProductRepository;

@Component
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	public List<Product> pro;
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public Optional<Product> getSpecificProduct(int productId) {
		// TODO Auto-generated method stub
		Optional<Product> pro = productRepository.findById(productId);
		return pro;
	}

	public List<Product> readListOfProduct() {
		// TODO Auto-generated method stub
		 pro =productRepository.findAll();
		 System.out.println("pro"+pro);
		return pro;
	}

}
