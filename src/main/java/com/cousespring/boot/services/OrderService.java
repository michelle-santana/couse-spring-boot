package com.cousespring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cousespring.boot.entities.Order;
import com.cousespring.boot.repositories.OrderRepository;

@Service
public class OrderService {
	
	
	@Autowired
	private OrderRepository repository; //dependencia da classe OrderRepository
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}

}
