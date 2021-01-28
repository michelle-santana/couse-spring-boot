package com.cousespring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cousespring.boot.entities.Product;
import com.cousespring.boot.repositories.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository repository; //dependencia da classe productRepository
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}

}
