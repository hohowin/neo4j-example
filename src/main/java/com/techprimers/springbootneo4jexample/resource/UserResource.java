package com.techprimers.springbootneo4jexample.resource;

import com.techprimers.springbootneo4jexample.model.User;
import com.techprimers.springbootneo4jexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/user")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping
    public Collection<User> getAllUsers() {
        return userService.getAll();
    }
}
