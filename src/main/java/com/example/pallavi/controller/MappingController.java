package com.example.pallavi.controller;

import com.example.pallavi.model.Student;
import com.example.pallavi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MappingController {


        @Autowired
        StudentService services;

        @GetMapping("/student_mapping")
        public List<Student> gethelloworld() {
            return services.getStudents();
        }

        @GetMapping("/student_mapping/{id}")
        public Student getStudent(@PathVariable int id) {

            return services.getStudent(id);
        }

        @PostMapping("/student_mapping")
        public void addStudent(@RequestBody Student student1) {


            services.addStudent(student1);
        }

        @PutMapping("/student_mapping/{id}")
        public void updateStudent(@RequestBody Student Student) {
            services.updateStudent(Student);
        }

        @DeleteMapping("/student_mapping/{id}")
        public void deleteStudent(@PathVariable int id) {
            services.deleterecord(id);
        }

        @GetMapping("hello")
        ResponseEntity<String> hello() {
            return ResponseEntity.ok(
                    "tHE MESSAGE ADDED");
        }
    }

