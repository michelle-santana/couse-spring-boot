package com.cousespring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cousespring.boot.entities.Category;
import com.cousespring.boot.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	
	@Autowired
	private CategoryRepository repository; //dependencia da classe userRepository
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}

}
