package com.example.sem3exampl3.services;


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

    public void processRegistration(){
        System.out.println("WTF");
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
}
