package com.learnjava.studentcrud.service;

import com.learnjava.studentcrud.dao.StudentDAO;
import com.learnjava.studentcrud.domain.Student;
import com.learnjava.studentcrud.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public void saveStudent(StudentDTO studentDTO) {
        studentDAO.saveStudent(Student.builder()
                .name(studentDTO.getName())
                .mobile(studentDTO.getMobile())
                .country(studentDTO.getCountry())
                .build());
    }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        studentDAO.updateStudent(Student.builder()
                .name(studentDTO.getName())
                .mobile(studentDTO.getMobile())
                .country(studentDTO.getCountry())
                .id(studentDTO.getId())
                .build());
    }

    @Override
    public void deleteStudentById(int id) {
        studentDAO.deleteStudentById(id);
    }
}
