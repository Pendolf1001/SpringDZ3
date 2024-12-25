package com.example.sem3exampl3.services;


import com.example.sem3exampl3.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    UserService userService;

    @Autowired
    DataProcessingService dataProcessingService;

    @Autowired
    NotificationService notificationService;

    public void processRegistration(String name, int age, String email){
        userService.createUser(name,age,email);

    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }


    public void addUser(User user) {
        userService.addUser(user);
    }
}
