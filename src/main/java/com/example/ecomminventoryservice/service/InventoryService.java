package com.example.ecomminventoryservice.service;
import com.example.ecomminventoryservice.beans.Inventory;

import com.example.ecomminventoryservice.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {

    private final InventoryRepository  inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory checkStock(Long id) {
        Optional<Inventory> byId = this.inventoryRepository.findById(id);
        return  byId.get();


    }

    public String addInventory(Inventory inventory) {
     this.inventoryRepository.save(inventory);
        return "Added inventory";
    }

    public String updateInventory(Inventory inventory) {
        this.inventoryRepository.save(inventory);
        return "updated inventory";
    }
}
