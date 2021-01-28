package com.cousespring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cousespring.boot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
