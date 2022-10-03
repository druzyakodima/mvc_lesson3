package ru.geekbrains.lesson4springboot.entites;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String id;
    private String name;
    private String cost;

    public Product(String id, String name, String cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public Product() {
    }
}
