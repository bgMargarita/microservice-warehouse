package com.microservice.warehouseservice.demo.service;

import com.microservice.warehouseservice.demo.entities.Item;
import com.microservice.warehouseservice.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void createItem(UUID id, String name, Integer amount) {
        Item item = new Item(id, name, amount);
        itemRepository.save(item);
    }

    @Override
    public void addExistingItem(UUID  id , Integer count) {
       Item item = itemRepository.findById(id);
        item.setAmount(item.getAmount()+count);
        itemRepository.update(item);
    }

    @Override
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemByID(UUID id) {
        return itemRepository.findById(id);
    }

    @Override
    public void deleteById(UUID id) {
        itemRepository.deleteById(id);
    }
}
