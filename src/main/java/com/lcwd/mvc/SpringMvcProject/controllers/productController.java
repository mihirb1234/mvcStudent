package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class productController {

    @GetMapping("/getProduct")
    public String getProduct(@RequestParam("productName") String name, @RequestParam("productRating")int rating , @RequestParam("productId") int id){
        System.out.println("productname "+name);
        System.out.println("product rating "+rating);
        System.out.println("product id"+id);
        return "this is testing url";
    }
}
