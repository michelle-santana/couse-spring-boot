package com.cousespring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cousespring.boot.entities.OrdemItem;

public interface OrderItemRepository extends JpaRepository<OrdemItem, Long>{

}
