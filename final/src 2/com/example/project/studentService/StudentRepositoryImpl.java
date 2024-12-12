package com.example.project.studentService;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to the repository.");
    }

    @Override
    public void deleteStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
        System.out.println("Student with ID " + id + " removed from the repository.");
    }

    @Override
    public Student findStudentById(String id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
        return students;
    }
}