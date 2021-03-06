package com.learnjava.studentcrud.service;

import com.learnjava.studentcrud.domain.Student;
import com.learnjava.studentcrud.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    void saveStudent(StudentDTO studentDTO);

    Student getStudentById(int id);

    void updateStudent(StudentDTO studentDTO);

    void deleteStudentById(int id);
}
