package com.learnjava.studentcrud.dao;

import com.learnjava.studentcrud.domain.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> getAllStudents();

    void saveStudent(Student student);
}
