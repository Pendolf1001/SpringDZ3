package com.example.sem3exampl3.repository;


import com.example.sem3exampl3.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private List<User> users= new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
