package com.poc.elasticsearch.ElasticSearch.controller;

import com.poc.elasticsearch.ElasticSearch.entity.Student;
import com.poc.elasticsearch.ElasticSearch.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/student")
public class StudentController {
   @Autowired
   private StudentService studentService;
   @GetMapping("/")
   public Iterable<Student> getAllStudents(){
      return studentService.findAllStudents();
   }
   @PostMapping("/add")
   public Student addStudent(@RequestBody Student student){
      return studentService.addStudent(student);
   }

}
