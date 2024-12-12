package com.example.project.AdminService.Controller;

import com.example.project.AdminService.AdminRepository;
import com.example.project.boss.UserController;

import java.util.List;
import java.util.Map;

public class AdminController extends UserController {

    private final AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void addUser(String userId, String userDetails) {
        adminRepository.addUser(userId, userDetails);
        System.out.println("Controller: User added with ID: " + userId);
    }

    public void deleteUser(String userId) {
        boolean success = adminRepository.deleteUser(userId);
        if (success) {
            System.out.println("Controller: User deleted with ID: " + userId);
        } else {
            System.out.println("Controller: User not found for ID: " + userId);
        }
    }

    public void updateUser(String userId, String newDetails) {
        boolean success = adminRepository.updateUser(userId, newDetails);
        if (success) {
            System.out.println("Controller: User updated with ID: " + userId);
        } else {
            System.out.println("Controller: User not found for ID: " + userId);
        }
    }

    public void bulkAddUsers(Map<String, String> userMap) {
        userMap.forEach((id, details) -> {
            adminRepository.addUser(id, details);
            System.out.println("Controller: Bulk user added with ID: " + id);
        });
    }

    public void bulkDeleteUsers(List<String> userIds) {
        userIds.forEach(userId -> {
            boolean success = adminRepository.deleteUser(userId);
            if (success) {
                System.out.println("Controller: Bulk user deleted with ID: " + userId);
            } else {
                System.out.println("Controller: User not found for ID: " + userId);
            }
        });
    }

    public void listAllUsers() {
        List<String> users = adminRepository.listUsers();
        System.out.println("Controller: Listing all users...");
        users.forEach(user -> System.out.println("User: " + user));
    }

    public void viewUserDetails(String userId) {
        String userDetails = adminRepository.getUserDetails(userId);
        if (userDetails != null) {
            System.out.println("Controller: User details for ID: " + userId + " -> " + userDetails);
        } else {
            System.out.println("Controller: User not found for ID: " + userId);
        }
    }

    public void assignRole(String userId, String role) {
        boolean success = adminRepository.assignRole(userId, role);
        if (success) {
            System.out.println("Controller: Role " + role + " assigned to user with ID: " + userId);
        } else {
            System.out.println("Controller: User not found for ID: " + userId);
        }
    }

    public void countUsers() {
        int count = adminRepository.countUsers();
        System.out.println("Controller: Total number of users: " + count);
    }
}