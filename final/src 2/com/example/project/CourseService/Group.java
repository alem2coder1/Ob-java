package com.example.project.CourseService;

public class Group {
    private String teacher;
    private String[] students;
    private String course;

    public Group(String teacher, String[] students, String course) {
        this.teacher = teacher;
        this.students = students;
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}