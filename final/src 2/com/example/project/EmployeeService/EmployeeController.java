package com.example.project.EmployeeService;

import com.example.project.boss.UserController;

import java.util.List;

public class EmployeeController extends UserController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void updateEmployeeSalary(String id, double newSalary) {
        employeeRepository.getAllEmployees().stream()
                .filter(employee -> employee.getId().equals(id))
                .forEach(employee -> {
                    ((Employee) employee).setSalary(newSalary);
                    System.out.println("Updated salary for " + employee.getName());
                });
    }

    public void sendMessage(Message message, Employee employee) {
        employee.addMessage(message);
        System.out.println("Message sent to " + employee.getName());
    }

    public void getUnreadMessages(Employee employee) {
        System.out.println("Unread messages for " + employee.getName() + ":");
        employeeRepository.getAllEmployees().stream()
                .filter(emp -> emp.getId().equals(employee.getId()))
                .forEach(emp -> System.out.println("Message: " + ((Employee) emp).getName()));
    }

    public void getAllMessages(Employee employee) {
        System.out.println("All messages for " + employee.getName() + ":");
    }
}