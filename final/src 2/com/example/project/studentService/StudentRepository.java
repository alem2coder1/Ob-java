package com.example.project.studentService;

import java.util.List;

public interface StudentRepository {
    void addStudent(Student student);
    void deleteStudent(String id);
    Student findStudentById(String id);
    List<Student> findAllStudents();
}