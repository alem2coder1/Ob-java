package com.example.project.studentService;

public class StudentViewEn {

    public void displayStudentDetails(Student student) {
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Faculty: " + student.getFaculty());
        System.out.println("Year: " + student.getYear());
    }

    public void displayCradeLetter(CradeLetter grade) {
        System.out.println("Grade: " + grade);
    }

    public void displayFaculty(Faculty faculty) {
        System.out.println("Faculty: " + faculty);
    }
}