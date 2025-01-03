package com.example.sem3exampl3.controller;


import com.example.sem3exampl3.domain.User;
import com.example.sem3exampl3.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RegistrationService service;

    @PostMapping("/body")
    public User addUser(@RequestBody User user ){
        service.addUser(user);
        return user;
    }

    @GetMapping
    public List<User> getListiUsers (){
        return service.getListiUsers();

    }


}
