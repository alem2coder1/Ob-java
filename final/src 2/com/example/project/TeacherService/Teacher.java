package com.example.project.TeacherService;

import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
import com.example.project.boss.User;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private String type;
    private List<String> courses = new ArrayList<>();
    private List<String> responsibilities = new ArrayList<>();
    private List<String> students = new ArrayList<>();
    public Teacher(String id, String email, String password, String name, String surname, String phoneNumber,
                   String gender, FamilyStatus familyStatus, Role role, String type) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
        this.type = type;
    }
    public void assignCourse(String courseName) {
        courses.add(courseName);
        System.out.println("Course assigned to teacher: " + courseName);
    }

    public void viewStudents() {
        System.out.println("Students under teacher supervision:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println("Student added: " + studentName);
    }

    public void addResponsibility(String responsibility) {
        responsibilities.add(responsibility);
        System.out.println("Responsibility added: " + responsibility);
    }

    public void putMark() {
        System.out.println("Mark assigned");
    }

    public void putAttendance() {
        System.out.println("Attendance recorded");
    }

    public void viewCourses() {
        System.out.println("Viewing courses");
    }

    public void viewTeacherSchedules() {
        System.out.println("Viewing teacher schedules");
    }

    public void uploadFiles() {
        System.out.println("Files uploaded");
    }

    public void sendComplaintsToDean() {
        System.out.println("Complaint sent to dean");
    }
}