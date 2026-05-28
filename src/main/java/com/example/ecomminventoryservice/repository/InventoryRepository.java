package com.example.ecomminventoryservice.repository;

import com.example.ecomminventoryservice.beans.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long > {
}
