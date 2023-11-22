package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.ProductService;

@RestController 
@RequestMapping("/products")

public class ProductController {
	
	  private final ProductService productService;
	  
	    public ProductController(ProductService productService) {
	        this.productService = productService;
	    } 
	  
	  	  
	  
	@PostMapping
    public Product createProduct(@RequestBody Product product) {
        // Logique pour enregistrer le produit
        return productService.saveProduct(product);
    }
	
	@GetMapping
    public List<Product> getAllProducts() {
        // Logique pour retourner tous les produits
        return productService.getAllProducts();
    }
	
	
	
	@GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        // Logique pour retourner un produit spécifique par son ID
        return productService.getProductById(id);
    }
	
}
