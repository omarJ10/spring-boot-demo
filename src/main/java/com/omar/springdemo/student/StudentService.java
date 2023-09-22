package com.omar.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {
    Student save(Student s);
    Student findByEmail(String email);
    List<Student> findAllStudents();
    Student update(Student s);
    void delete(String email);
}
