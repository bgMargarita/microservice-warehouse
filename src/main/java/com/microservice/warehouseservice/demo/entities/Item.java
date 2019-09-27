package com.microservice.warehouseservice.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Item {
    @Id
    private UUID id;
    private String name;
    private Integer amount;

    public Item(UUID id, String name, Integer amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
