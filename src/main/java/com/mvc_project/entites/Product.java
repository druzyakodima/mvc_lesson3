package com.mvc_project.entites;

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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

}
