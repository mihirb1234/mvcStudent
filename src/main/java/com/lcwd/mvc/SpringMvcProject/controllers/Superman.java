package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Superman {

    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("processing about request");
        return "about";
    }
    @RequestMapping("/services")
    public String servicesRequestHandler(){
        System.out.println("processing services request");
        return "services";
    }
}
