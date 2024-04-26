package com.program.inventoryservice.repostitory;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.program.inventoryservice.entity.Inventory;

@Repository
public interface InventoryRepostitory extends CrudRepository<Inventory, Integer> {
	Optional<Inventory> findBySkucode(String skucode);
 }
