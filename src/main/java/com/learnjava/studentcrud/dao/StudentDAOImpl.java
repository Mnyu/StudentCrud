package com.learnjava.studentcrud.dao;

import com.learnjava.studentcrud.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM STUDENTS";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    public void saveStudent(Student student) {
        String sql = "INSERT INTO STUDENTS(NAME, MOBILE, COUNTRY) VALUES(?, ?, ?)";
        Object[] sqlParams = {student.getName(), student.getMobile(), student.getCountry()};
        jdbcTemplate.update(sql, sqlParams);
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM STUDENTS WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), id);
    }

    @Override
    public void updateStudent(Student student) {
        String sql = "UPDATE STUDENTS SET NAME = ?, MOBILE = ?, COUNTRY = ? WHERE ID = ?";
        Object[] sqlParams = {student.getName(), student.getMobile(), student.getCountry(), student.getId()};
        jdbcTemplate.update(sql, sqlParams);
    }

    @Override
    public void deleteStudentById(int id) {
        String sql = "DELETE FROM STUDENTS WHERE ID = ?";
        jdbcTemplate.update(sql, id);
    }
}
