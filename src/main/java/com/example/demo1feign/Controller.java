package com.example.demo1feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    Config config;
    @GetMapping("/get/{name}")
    public User getAll(@PathVariable String name){
        return config.getByName(name);
    }

}
