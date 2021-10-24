package com.learnjava.studentcrud.controllers;

import com.learnjava.studentcrud.domain.Student;
import com.learnjava.studentcrud.dto.StudentDTO;
import com.learnjava.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/showStudents")
    public String showStudentsList(Model model) {
        List<Student> students = studentService.getAllStudents();

        model.addAttribute("students", students);
        return "students-list";
    }

    @GetMapping("/addStudent")
    public String addStudent(Model model) {
        model.addAttribute("studentDTO", new StudentDTO());
        return "add-student";
    }

    @PostMapping("/save-student")
    public String showStudentSavedPage(StudentDTO studentDTO) {
        if(studentDTO.getId() != 0) {
            studentService.updateStudent(studentDTO);
        } else {
            studentService.saveStudent(studentDTO);
        }
        return "redirect:/showStudents";
    }

    @GetMapping("/updateStudent")
    public String updateStudent(@RequestParam("userId") int id,  Model model) {
        model.addAttribute("studentDTO", studentService.getStudentById(id));
        return "add-student";
    }
}
