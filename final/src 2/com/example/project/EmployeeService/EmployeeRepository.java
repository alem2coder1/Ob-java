package com.example.project.EmployeeService;

import java.util.List;

public interface EmployeeRepository {
    void findEmployeeByEmail(String email);

    void findEmployeeById(String id);

    void addEmployee(Employee employee);

    List<Employee> getAllEmployees();
}