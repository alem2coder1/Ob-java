package com.example.project.CourseService;

import java.util.HashMap;
import java.util.Map;

public class CourseRepositoryImpl implements CourseRepository {
    private Map<String, Course> courseMap = new HashMap<>();

    @Override
    public void openCourse(Course course) {
        courseMap.put(course.getCourseId(), course);
        System.out.println("Course opened: " + course.getName());
    }

    @Override
    public Course findCourseById(String courseId) {
        return courseMap.get(courseId);
    }

    @Override
    public Course findActivatedCourseByCourseName(String courseName) {
        return courseMap.values().stream()
                .filter(course -> course.getName().equalsIgnoreCase(courseName))
                .findFirst()
                .orElse(null);
    }
}