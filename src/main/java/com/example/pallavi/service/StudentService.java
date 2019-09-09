package com.example.pallavi.service;

import com.example.pallavi.model.Student;
import com.example.pallavi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getStudents()
    {
        List<Student> students=new ArrayList<>();
       studentRepository.findAll().forEach(students::add);
        return  students;
    }

    public Student getStudent(int id)
    {
      // return students.stream().filter(t->t.getName().equals(id)).findFirst().get();
        return studentRepository.findById(id).get();
    }

    public void addStudent(Student studen)
    {
    // students.add(studen);
     studentRepository.save(studen);
    }


    public void updateStudent(Student student) {

      /*  for(int i=0;i<students.size();i++)
        {
            if(Student.getId()==students.get(i).getId())
            {
               students.set(i,Student);
            }
        }
        */
      studentRepository.save(student);
    }

    public void deleterecord(int id)
    {
        //students.removeIf(t->t.getId()==id);
        studentRepository.deleteById(id);
    }
}
