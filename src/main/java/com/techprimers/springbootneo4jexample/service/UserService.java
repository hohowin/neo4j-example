package com.techprimers.springbootneo4jexample.service;

import com.techprimers.springbootneo4jexample.model.User;
import com.techprimers.springbootneo4jexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}
