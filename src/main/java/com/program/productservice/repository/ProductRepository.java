package com.program.productservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.program.productservice.entity.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
