package com.example.studentmanagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.studentmanagement.Model.Student;
import com.example.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

    StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        return repository.findById(id).map(student -> {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setCourse(updatedStudent.getCourse());
            return repository.save(student);
        }).orElse(null);
    }

    public boolean deleteStudent(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
