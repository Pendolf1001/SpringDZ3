package com.example.sem3exampl3.controller;


import com.example.sem3exampl3.domain.User;
import com.example.sem3exampl3.services.DataProcessingService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskControler {

    DataProcessingService service;

    public TaskControler(DataProcessingService service) {
        this.service = service;
    }


    @GetMapping
    public List<String> getAllTasks(){
        List <String> tasks=new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");

        return  tasks;

    }


    @GetMapping("/sort")
    public List<User> sortUsersByAge(){
        return service.sortUsersByAge(service.getUserRepository().getUsers());
    }

    @GetMapping("filter/{age}")
    public  List<User>  filterUsersByAge(@PathVariable("age") int age){
        return service.filterUsersByAge(service.getUserRepository().getUsers(), age );
    }


    @GetMapping("/calc")
    public double calculateAverageAge(){
        return service.calculateAverageAge(service.getUserRepository().getUsers());
    }


}
