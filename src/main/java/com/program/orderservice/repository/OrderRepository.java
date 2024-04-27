package com.program.orderservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.program.orderservice.entity.OrderLineItems;

@Repository
public interface OrderRepository extends CrudRepository<OrderLineItems, Integer>{

}
