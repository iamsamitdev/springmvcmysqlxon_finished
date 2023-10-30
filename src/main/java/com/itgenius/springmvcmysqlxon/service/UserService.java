package com.itgenius.springmvcmysqlxon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgenius.springmvcmysqlxon.model.User;
import com.itgenius.springmvcmysqlxon.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // Get All Users
    public List<User> findAll(){
        return userRepository.findAll();
    }

    // Add User
    public User save(User user){
        return userRepository.save(user);
    }

    // Find User by ID
    public Optional<User> findById(Integer id){
        return userRepository.findById(id);
    }

    // Delete User
    public void delete(User user){
        userRepository.delete(user);
    }

}
