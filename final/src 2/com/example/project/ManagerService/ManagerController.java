package com.example.project.ManagerService;

public class ManagerController {
    private Manager manager;
    private News news;
    private ManagerView view;

    public ManagerController(Manager manager, News news, ManagerView view) {
        this.manager = manager;
        this.news = news;
        this.view = view;
    }

    public void registerStudentForCourse() {
        manager.getStudentInfo();
        System.out.println("Registering student for a course...");
    }

    public void assignCourseToTeacher() {
        manager.getTeacherInfo();
        System.out.println("Assigning course to teacher...");
    }

    public void activateCourse() {
        manager.getReport();
        System.out.println("Activating course...");
    }

    public void manageNews() {
        news.addNews();
        news.getNewsList();
    }
}