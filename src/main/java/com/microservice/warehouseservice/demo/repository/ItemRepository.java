package com.microservice.warehouseservice.demo.repository;

import com.microservice.warehouseservice.demo.entities.Item;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findById(UUID id);

    void deleteById(UUID id);

    void update(Item item);
}
