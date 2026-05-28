package com.example.ecomminventoryservice.controller;

import com.example.ecomminventoryservice.beans.Inventory;
import com.example.ecomminventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/{productId}")
    public Inventory checkInventory(@PathVariable Long productId ) throws InterruptedException {
       // Thread.sleep(15000);
      return  this.inventoryService.checkStock(productId);
      //  return  productId.equals("1") ? "IN-STOCK" : "Out of stock";
    }

    @PostMapping
    public String addInventory(@RequestBody Inventory inventory){
        return inventoryService.addInventory(inventory);
    }

    @PutMapping
    public String updateInventory(@RequestBody Inventory inventory){
        return inventoryService.updateInventory(inventory);
    }

}
