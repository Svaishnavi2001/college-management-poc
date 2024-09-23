package com.college.repository;

import com.college.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface StudentRepo extends JpaRepository<Student, Integer> {

    Student findByName(String name);
    Student deleteByName(String name);
}
