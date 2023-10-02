package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Product;
import com.geekster.Ecommerce.API.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    public Product getProductById(Integer id) {
        return productRepo.findById(id).orElseThrow();
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepo.findByCategory(category);
    }

    public Product updateProduct(Integer id, Product newProduct) {
        Product existingProduct = getProductById(id);
        existingProduct.setName(newProduct.getName());
        existingProduct.setPrice(newProduct.getPrice());
        existingProduct.setDescription(newProduct.getDescription());
        existingProduct.setCategory(newProduct.getCategory());
        existingProduct.setBrand(newProduct.getBrand());
        return productRepo.save(existingProduct);
    }

    public void deleteProduct(Integer id) {
        Product product = getProductById(id);
        productRepo.delete(product);
    }
}
