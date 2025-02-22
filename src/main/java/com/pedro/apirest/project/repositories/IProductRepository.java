package com.pedro.apirest.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.apirest.project.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{
    
}
