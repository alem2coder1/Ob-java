package com.example.project.studentService;

import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
import com.example.project.boss.User;
import com.example.project.boss.User;

public class Student extends User {
    private Faculty faculty;
    private int year;
    private double gpa; // 学生的 GPA
    private String grade;

    public Student(String id, String email, String password, String name, String surname, String phoneNumber,
                   String gender, FamilyStatus familyStatus, Role role, Faculty faculty, int year, double gpa, String grade) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
        this.faculty = faculty;
        this.year = year;
        this.gpa = gpa;
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void enrollCourse() {
        System.out.println(getName() + " has enrolled in a course.");
    }

    public void viewSchedule() {
        System.out.println(getName() + " is viewing the schedule.");
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void register() {
    }

    public void getTeacherInfo() {
    }

    public void viewTranscript() {
    }

    public void viewFinancialInfo() {
    }

    public void rateTeacher() {
    }

    public void toRequest() {
    }

    public void viewSchedules() {
    }

    public void FXRegister() {
    }

    public void willBeAssistent() {
    }

    public void viewFiles() {
    }

    public void viewExamSchedule() {
    }

}