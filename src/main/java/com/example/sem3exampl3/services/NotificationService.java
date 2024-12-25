package com.example.sem3exampl3.services;


import com.example.sem3exampl3.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser (User user){
        System.out.println("A new user has been created: "+ user.getName());
    }

}
