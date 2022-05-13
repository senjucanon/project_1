package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getcontroller {

    @GetMapping("/home")
    public String getstring()
    {
        return "Welcome to Home";
    }

    @GetMapping("/home/{text}")
    public String fun(@PathVariable(name="text") String name)
    {
        return name.toUpperCase();
    }

}