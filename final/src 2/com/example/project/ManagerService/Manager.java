package com.example.project.ManagerService;

import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
import com.example.project.boss.User;

public class Manager extends User {
    private String department;

    public Manager(String id, String email, String password, String name, String surname, String phoneNumber,
                   String gender, FamilyStatus familyStatus, Role role, String department) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
        this.department = department;
    }

    public void getTeacherInfo() {
        System.out.println(getName() + " is fetching teacher information...");
    }

    public void getStudentInfo() {
        System.out.println(getName() + " is fetching student information...");
    }

    public void getReport() {
        System.out.println(getName() + " is generating a report...");
    }

    public void getStudentsRequests() {
        System.out.println(getName() + " is handling student requests...");
    }

    public void getStudentFinanceInfo() {
        System.out.println(getName() + " is accessing student financial information...");
    }

    public void manageNews() {
        System.out.println(getName() + " is managing news...");
    }

    public void displayAllNews() {
        System.out.println(getName() + " is displaying all news...");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}