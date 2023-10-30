package com.itgenius.springmvcmysqlxon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itgenius.springmvcmysqlxon.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
