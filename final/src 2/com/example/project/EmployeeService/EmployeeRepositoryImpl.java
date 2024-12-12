package com.example.project.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void findEmployeeByEmail(String email) {
        employees.stream()
                .filter(employee -> employee.getEmail().equals(email))
                .forEach(employee -> System.out.println("Found employee: " + employee.getName()));
    }

    @Override
    public void findEmployeeById(String id) {
        employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .forEach(employee -> System.out.println("Found employee: " + employee.getName()));
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}