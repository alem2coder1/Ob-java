package com.example.project.EmployeeService;

import com.example.project.boss.User;
import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;

public class Employee extends User {
    private double salary;

    public Employee(String id, String email, String password, String name, String surname, String phoneNumber,
                    String gender, FamilyStatus familyStatus, Role role, double salary) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addMessage(Message message) {

    }
}