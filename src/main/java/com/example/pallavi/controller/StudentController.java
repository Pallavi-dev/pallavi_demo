package com.example.pallavi.controller;

import com.example.pallavi.model.Student;
import com.example.pallavi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public List<Student> getHelloWorld() {
        return studentService.getStudents();
    }

    @RequestMapping("/student/{id}")
    public Student getStudent(@PathVariable Integer id) {

        return studentService.getStudent(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/student")
    public void addStudent(@RequestBody Student student1) {
        studentService.addStudent(student1);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/student/{id}")
    public void updateStudent(@RequestBody Student Student) {
        studentService.updateStudent(Student);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/student/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleterecord(id);
    }
}
//ResponseEntity