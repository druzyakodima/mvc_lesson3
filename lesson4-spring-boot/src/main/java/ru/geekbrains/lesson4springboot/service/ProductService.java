package ru.geekbrains.lesson4springboot.service;

import ru.geekbrains.lesson4springboot.entites.Product;
import ru.geekbrains.lesson4springboot.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  ProductService {

    private ProductsRepository productsRepository = new ProductsRepository();

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
    public Product getProductId(String id) {
        return productsRepository.findOneById(id);
    }

    public ProductService() {
    }

}
