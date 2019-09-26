package com.microservice.warehouseservice.demo.controller;

import com.microservice.warehouseservice.demo.entities.Item;
import com.microservice.warehouseservice.demo.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/warehouse")
public class WareHauseController {
    private ItemServiceImpl itemService;

    @Autowired
    public WareHauseController(ItemServiceImpl itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/create")
    public void createItem(UUID id, String name, Integer amount) {
        itemService.createItem(UUID id, String name, Integer amount);
    }

    @PostMapping("/add/id")
    public void addExistingItem(UUID id, Integer amount) {
        itemService.addExistingItem(id, amount);
    }

    @PostMapping("/delete/{id}")
    public void deleteItem(@PathVariable("id") UUID id) {
        itemService.deleteById(id);
    }

    @GetMapping("/get/{id}")
    public Item getItemById(@PathVariable("id") UUID id) {
        return itemService.getItemByID(id);
    }

    @GetMapping("/get")
    public List<Item> getItems() {
        return itemService.getItems();
    }
}
