package com.example.project.CourseService;

import com.example.project.boss.UserController;

public class CourseController extends UserController {

    public void openCourse(String courseId) {
        System.out.println("Opening course with ID: " + courseId);
    }

    public void findCourseById(String courseId) {
        System.out.println("Finding course with ID: " + courseId);
    }

    public void findActivatedCourseByCourseName(String courseName) {
        System.out.println("Finding activated course with name: " + courseName);
    }
}