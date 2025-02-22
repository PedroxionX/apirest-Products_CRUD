package com.pedro.apirest.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.apirest.project.entities.Product;
import com.pedro.apirest.project.repositories.IProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductRepository productRepository;

    @GetMapping // ("path")
    public List<Product> getAllProducts(/* @RequestParam String param */) {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@RequestParam Long id) {
        return productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el usuario"));
    }

    @PostMapping // ("path")
    public Product createProduct(@RequestBody Product entity) {
        return productRepository.save(entity);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product entity) {
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("no lo encontre lol"));

        product.setName(entity.getName());
        product.setName(entity.getPrice());

        return productRepository.save(entity);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("no"));

        productRepository.delete(product);

        return "N";
    }

}
