package com.example.CrudSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudSpringBoot.entity.Student;
import com.example.CrudSpringBoot.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudents(Long id)
    {
        return studentRepository.findById(id);
    }

    public void saveOrUpdate(Student student)
    {
        studentRepository.save(student);
    }

    public void delete(Long id)
    {
        studentRepository.deleteById(id);
    }
}
