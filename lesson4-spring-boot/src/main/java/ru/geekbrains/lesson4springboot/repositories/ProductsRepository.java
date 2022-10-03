package ru.geekbrains.lesson4springboot.repositories;

import lombok.Getter;
import ru.geekbrains.lesson4springboot.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;



@Component
@Getter
public class ProductsRepository {
    private ArrayList<Product> productList;


    public ProductsRepository() {
        this.productList = new ArrayList<>();
        productList.add(new Product("22","Product Z","343"));
        productList.add(new Product("214","Product Y","324"));
        productList.add(new Product("123","Product W","654"));
    }

    public int size() {
        return productList.size();
    }

    public Product findOneById(String id) {
        if (!productList.isEmpty()) {
            for (Product product : productList) {
                if (product.getId().equals(id)) {
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

}