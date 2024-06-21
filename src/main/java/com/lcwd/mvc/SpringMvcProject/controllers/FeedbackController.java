package com.lcwd.mvc.SpringMvcProject.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class FeedbackController {

    @GetMapping("/feedback")
    public List<String>getFeedBacks(){
        List<String> feedbacks=Arrays.asList(
                "good course",
                "nice one",
                "valuable"
        );
        return feedbacks;
    }

    @PostMapping("/create-feedback")
    public String createFeedback(){
        System.out.println("feedback created");
        return "created feedback";
    }

}
