package com.example.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

@Repository
public class ProductRepository {
	
	 private final String jsonFilePath2= "babar";
    private final static String jsonFilePath = "D:\\4-workspace\\training\\JAVA\\alten-shop-back-products\\front\\src\\assets\\products.json";
  
    private final ObjectMapper objectMapper = new ObjectMapper();
    static {
        System.out.printf("Ce code est exécuté lors de l'initialisation de la classe.", jsonFilePath);
    }
   
    public List<Product> findAll() {
        try {
        	  
            return objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Product>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'exception ou la propager
            return new ArrayList<>();
        }
    }

    public Product save(Product product) {
        // Logique pour ajouter/mettre à jour le produit dans le fichier JSON
        // Similaire à la méthode saveProduct dans ProductService
        return product;
    }

    // ... Autres méthodes pour les opérations CRUD
}