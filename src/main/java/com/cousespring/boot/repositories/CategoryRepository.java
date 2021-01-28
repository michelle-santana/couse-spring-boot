package com.cousespring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cousespring.boot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
