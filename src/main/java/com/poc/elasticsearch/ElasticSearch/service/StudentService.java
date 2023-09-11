package com.poc.elasticsearch.ElasticSearch.service;

import com.poc.elasticsearch.ElasticSearch.entity.Student;
import com.poc.elasticsearch.ElasticSearch.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
   @Autowired
   private StudentRepository studentRepository;

   public Iterable<Student> findAllStudents(){
      return studentRepository.findAll();
   }
   public Student addStudent(Student student){
      return studentRepository.save(student);
   }
}
