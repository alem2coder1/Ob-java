package com.example.project.AdminService;

import java.util.List;
import java.util.Map;

public interface AdminRepository {
    void addUser(String userId, String userDetails);

    boolean deleteUser(String userId);

    boolean updateUser(String userId, String newDetails);

    List<String> listUsers();

    String getUserDetails(String userId);

    boolean assignRole(String userId, String role);

    int countUsers();
}