package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepository;

    // Injection du ProductRepository via le constructeur
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Méthode pour enregistrer ou mettre à jour un produit
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Méthode pour obtenir la liste de tous les produits
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Méthode pour obtenir un produit par son ID
    public Product getProductById(int id) {
        // Ici, vous devrez implémenter la logique pour trouver le produit par son ID
        // dans la liste retournée par productRepository.findAll()
        List<Product> products = productRepository.findAll();
        return products.stream()
                       .filter(product -> product.getId() == id)
                       .findFirst()
                       .orElse(null); // Retourne null si le produit n'est pas trouvé
    }

}
