package com.example.sem3exampl3.services;

import com.example.sem3exampl3.domain.User;
import com.example.sem3exampl3.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private NotificationService notificationService;
    private UserRepository repository;

    public UserService(NotificationService notificationService, UserRepository repository) {
        this.notificationService = notificationService;
        this.repository = repository;
    }

    public User createUser(String name, int age, String email){
        User user= new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        notificationService.notifyUser(user);

        return user;

    }

    public void addUser(User user){
        repository.addUser(user);
        notificationService.notifyAddingToRepository(user);
    }





}
