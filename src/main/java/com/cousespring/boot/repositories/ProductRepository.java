package com.cousespring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cousespring.boot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
