package com.cousespring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cousespring.boot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
