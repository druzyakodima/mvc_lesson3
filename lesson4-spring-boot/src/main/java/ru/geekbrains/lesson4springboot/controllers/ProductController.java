package ru.geekbrains.lesson4springboot.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.lesson4springboot.entites.Product;
import ru.geekbrains.lesson4springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String listPage(Model uiModel) {
        if (productService.getListProduct() != null) {
            uiModel.addAttribute("productList", productService.getListProduct());
            return "products";
        } else {
            return "productList-null";
        }
    }

    @RequestMapping("/add")
    public String showSimpleForm(@ModelAttribute("product") Product product) {
        logger.info("Add new product");
        if (!productService.getListProduct().contains(product)) {
            productService.addProductInRepository(product);
            return "product-form-result-add";
        }
        return "redirect:/product";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        return "redirect:/product";
    }

    @GetMapping("/showFormAddProduct")
    public String addProduct(Model model) {
        logger.info("Add new product");
        model.addAttribute("product", new Product());
        return "product-add-form";
    }

    @RequestMapping(path = "/findProductById")
    public String findProductById(@ModelAttribute("product") Product product) {
        return "product-find-by-id";
    }

    @RequestMapping(path = "/showProductById")
    public String showProductById(Model model, @RequestParam("id") String id) {
        Product product = productService.getProductId(id);
        model.addAttribute("product", product);
        return "product-form-result-add";
    }
}

