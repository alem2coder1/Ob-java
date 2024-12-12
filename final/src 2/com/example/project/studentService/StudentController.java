package com.example.project.studentService;

import java.util.List;
import com.example.project.boss.UserController;
import com.example.project.boss.User;

import java.util.*;
import java.util.stream.Collectors;

public class StudentController extends UserController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void rankStudentsByGrade() {
        List<Student> students = studentRepository.findAllStudents();
        students.sort(Comparator.comparing(Student::getGrade).reversed()); // 按成绩降序排序
        System.out.println("Students ranked by CradeLetter:");
        students.forEach(student -> System.out.println(student.getName() + " - Grade: " + student.getGrade()));
    }

    public void rankStudentsByGpa() {
        List<Student> students = studentRepository.findAllStudents();
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed()); // 按 GPA 降序排序
        System.out.println("Students ranked by GPA:");
        students.forEach(student -> System.out.println(student.getName() + " - GPA: " + student.getGpa()));
    }

    public void filterStudentsByFaculty(Faculty faculty) {
        List<Student> students = studentRepository.findAllStudents();
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getFaculty() == faculty) // 枚举直接用 ==
                .collect(Collectors.toList());
        System.out.println("Students in faculty " + faculty + ":");
        filteredStudents.forEach(student -> System.out.println(student.getName()));
    }
    public void filterStudentsByYear(int year) {
        List<Student> students = studentRepository.findAllStudents();
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getYear() == year)
                .collect(Collectors.toList());
        System.out.println("Students in year " + year + ":");
        filteredStudents.forEach(student -> System.out.println(student.getName()));
    }

    public void listAllStudents() {
        List<Student> students = studentRepository.findAllStudents();
        System.out.println("All Students:");
        students.forEach(student -> System.out.println(student.getName() + " (" + student.getFaculty() + ")"));
    }

    public void importStudents(List<Student> students) {
        for (Student student : students) {
            addUser(student);
            studentRepository.addStudent(student);
        }
    }

    public void createStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void removeStudent(String id) {
        studentRepository.deleteStudent(id);
    }

    public void showStudentDetails(String id) {
        Student student = studentRepository.findStudentById(id);
        if (student != null) {
            System.out.println("Student Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Faculty: " + student.getFaculty());
            System.out.println("Year: " + student.getYear());
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

}