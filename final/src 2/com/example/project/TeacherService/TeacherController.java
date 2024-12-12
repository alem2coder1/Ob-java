package com.example.project.TeacherService;

import com.example.project.boss.UserController;

public class TeacherController extends UserController {
    private Teacher teacher;
    private TeacherViewEn view;
    private News news;

    public TeacherController(Teacher teacher, TeacherViewEn view, News news) {
        this.teacher = teacher;
        this.view = view;
        this.news = news;
    }

    public void assignMark() {
        teacher.putMark();
        view.putMarks();
        System.out.println("Marks have been assigned.");
    }

    public void manageNews() {
        news.addNews();
        news.removeNews();
        news.getNewsList();
        System.out.println("News has been managed.");
    }

    public void displayTeacherDashboard() {
        view.getView();
        teacher.viewCourses();
        System.out.println("Teacher dashboard displayed.");
    }

    public void handleMessages() {
        view.seeMessages();
        view.sendMessage();
        System.out.println("Messages have been handled.");
    }

    public void assignCourse(String courseName) {
        teacher.assignCourse(courseName);
        System.out.println("Assigned course: " + courseName);
    }

    public void viewAllStudents() {
        teacher.viewStudents();
        System.out.println("All students displayed.");
    }

    public void addResponsibility(String responsibility) {
        teacher.addResponsibility(responsibility);
        System.out.println("Added responsibility: " + responsibility);
    }

    public void handleLeaveRequest(String reason) {
        System.out.println("Leave request handled for reason: " + reason);
    }
}