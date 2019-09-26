package com.microservice.warehouseservice.demo.service;

import com.microservice.warehouseservice.demo.entities.Item;

import java.util.List;
import java.util.UUID;

public interface ItemService {
    void createItem(UUID id, String name, Integer amount);

    void addExistingItem(UUID id, Integer count);

    List<Item> getItems();

    Item getItemByID(UUID id);

    void deleteById(UUID id);

}
