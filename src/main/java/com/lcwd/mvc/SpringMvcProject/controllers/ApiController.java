package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


//@Controller
@RestController   //controller + response body
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
    public String helloApi(){
        return "hello hi how doyado";
    }
    @RequestMapping(value = "/user" , method = RequestMethod.GET)
//    @ResponseBody
    public List<String> getUserData(){
        return Arrays.asList("joe","ubuntu","john");
    }

    @RequestMapping(value = "/create-user", method = RequestMethod.POST)
    public String createUser(){
        System.out.println("creating user");
        return "user created!";
    }
}
