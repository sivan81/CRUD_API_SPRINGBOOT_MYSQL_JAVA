package com.example.CrudSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CrudSpringBoot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
