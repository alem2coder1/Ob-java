package com.example.project.AdminService.Model;

import com.example.project.boss.User;
import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;

import java.util.Objects;

public class Admin extends User {
    private String role;
    private boolean isActive;

    public Admin(String id, String email, String password, String name, String surname, String phoneNumber,
                 String gender, FamilyStatus familyStatus, Role role, String adminRole, boolean isActive) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
        this.role = adminRole;
        this.isActive = isActive;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void removeUser(String userId) {
        System.out.println("Admin " + getName() + " is removing user with ID: " + userId);
    }

    public void addUser(String userId, String userDetails) {
        System.out.println("Admin " + getName() + " is adding user with ID: " + userId);
    }

    public void disableUser(String userId) {
        System.out.println("Admin " + getName() + " is disabling user with ID: " + userId);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", role='" + role + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return isActive == admin.isActive && Objects.equals(role, admin.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), role, isActive);
    }
}