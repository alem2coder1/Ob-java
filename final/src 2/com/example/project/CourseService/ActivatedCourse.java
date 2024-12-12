package com.example.project.CourseService;

import com.example.project.boss.User;
import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;

public class ActivatedCourse extends User {
    private String courseId;

    public ActivatedCourse(String id, String email, String password, String name, String surname, String phoneNumber,
                           String gender, FamilyStatus familyStatus, Role role, String courseId) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
        this.courseId = courseId;
    }

    public void addStudent() {
        System.out.println("Adding student to activated course: " + courseId);
    }

    public void getGroupByNumber(String groupNumber) {
        System.out.println("Fetching group by number: " + groupNumber);
    }

    public void assignTeacher(String teacherName) {
        System.out.println("Assigning teacher " + teacherName + " to course: " + courseId);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}