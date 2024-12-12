package com.example.project.CourseService;

public interface CourseRepository {
    void openCourse(Course course);

    Course findCourseById(String courseId);

    Course findActivatedCourseByCourseName(String courseName);
}