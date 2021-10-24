package com.learnjava.studentcrud.controllers;

import com.learnjava.studentcrud.dao.StudentDAO;
import com.learnjava.studentcrud.domain.Student;
import com.learnjava.studentcrud.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    private StudentDAO studentDAO;

    @Autowired
    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/showStudents")
    public String showStudentsList(Model model) {
        List<Student> students = studentDAO.getAllStudents();

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
        studentDAO.saveStudent(Student.builder()
                        .name(studentDTO.getName())
                        .mobile(studentDTO.getMobile())
                        .country(studentDTO.getCountry())
                        .build());
        return "redirect:/showStudents";
    }
}
