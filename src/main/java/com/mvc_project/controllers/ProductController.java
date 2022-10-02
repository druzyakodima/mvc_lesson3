package com.mvc_project.controllers;

import com.mvc_project.entites.Product;
import com.mvc_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/showProducts")
    public String showAllProducts(Model uiModel) {
        if (productService.sizeProductList() != 0) {
            uiModel.addAttribute("productList", productService.getListProduct());
            return "products";
        } else {
            return "productList-null";
        }
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(Model uiModel, @RequestParam int id) {
        Product product = productService.getProductId(id);
        return product;
    }

    @RequestMapping("/showFormAddProduct")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-add-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        productService.addProductInRepository(product);
        return "product-form-result-add";
    }
}

