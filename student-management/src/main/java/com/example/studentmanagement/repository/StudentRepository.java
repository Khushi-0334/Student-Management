package com.example.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentmanagement.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
