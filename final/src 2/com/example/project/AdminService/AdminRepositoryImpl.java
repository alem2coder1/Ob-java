package com.example.project.AdminService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminRepositoryImpl implements AdminRepository {
    private final Map<String, String> users = new HashMap<>();
    private final Map<String, String> roles = new HashMap<>();

    @Override
    public void addUser(String userId, String userDetails) {
        users.put(userId, userDetails);
        System.out.println("Repository: User added with ID: " + userId);
    }

    @Override
    public boolean deleteUser(String userId) {
        if (users.containsKey(userId)) {
            users.remove(userId);
            roles.remove(userId);
            System.out.println("Repository: User deleted with ID: " + userId);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateUser(String userId, String newDetails) {
        if (users.containsKey(userId)) {
            users.put(userId, newDetails);
            System.out.println("Repository: User updated with ID: " + userId);
            return true;
        }
        return false;
    }

    @Override
    public List<String> listUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public String getUserDetails(String userId) {
        return users.get(userId);
    }

    @Override
    public boolean assignRole(String userId, String role) {
        if (users.containsKey(userId)) {
            roles.put(userId, role);
            System.out.println("Repository: Role " + role + " assigned to user with ID: " + userId);
            return true;
        }
        return false;
    }

    @Override
    public int countUsers() {
        return users.size();
    }
}