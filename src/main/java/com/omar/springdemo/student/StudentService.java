package com.omar.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "omar",
                        "jalled",
                        LocalDate.now(),
                        "jalledomar@gmail.com",
                        34
                ),
                new Student(
                        "farah",
                        "jalled",
                        LocalDate.now(),
                        "jalledjalled@gmail.com",
                        17
                )
        );
}}
