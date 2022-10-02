package com.mvc_project.repositories;

import com.mvc_project.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
    private ArrayList<Product> productList;

    public ProductsRepository() {
        this.productList = new ArrayList<>();
    }

    public int size() {
        return productList.size();
    }



    public Product findOneById(int id) {
        if (!productList.isEmpty()) {
            for (Product product : productList) {
                if (Integer.parseInt(product.getId()) == id) {
                    return product;
                }
            }
        }
        return new Product(null,null,null);
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void setProductList(ArrayList<Product> products) {
        this.productList = products;
    }

    public List<Product> getProductList() {
        return productList;
    }

}