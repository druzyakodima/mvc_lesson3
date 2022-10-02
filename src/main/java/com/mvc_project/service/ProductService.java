package com.mvc_project.service;

import com.mvc_project.entites.Product;
import com.mvc_project.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  ProductService {

    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getListProduct() {
        return productsRepository.getProductList();
    }

    public int sizeProductList() {
        return productsRepository.size();
    }

    public void addProductInRepository(Product product) {
        productsRepository.addProduct(product);
    }
    public Product getProductId(int id) {
        return productsRepository.findOneById(id);
    }

    public ProductService() {
    }
}
