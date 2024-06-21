package com.lcwd.mvc.SpringMvcProject.controllers;

import com.lcwd.mvc.SpringMvcProject.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody List<Student> students) {
    //        if (students.isEmpty()) {
    //            // Handle the case where the student list is empty
    //            throw new IllegalArgumentException("Student list cannot be empty");
    //        }

        // Modify the department of the first student
//        String str=null;
//        System.out.println(str.length());

        Student student = students.get(0);
        student.setDept("Test");

        ResponseEntity<Student> response=new ResponseEntity<>(student, HttpStatus.CREATED);
        return response;

        // Return the modified student

    }
}
