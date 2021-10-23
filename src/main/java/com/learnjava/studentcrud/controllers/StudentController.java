package com.learnjava.studentcrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudents")
    public String showStudentsList() {
        return "students-list";
    }
}
