package com.example.project.UniverService;

import com.example.project.boss.User;
import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
import java.util.ArrayList;
import java.util.List;

public class ParentCommunication extends User {
    private List<String> notifications = new ArrayList<>();

    public ParentCommunication(String id, String email, String password, String name, String surname,
                               String phoneNumber, String gender, FamilyStatus familyStatus, Role role) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
    }

    public void addNotification(String message) {
        notifications.add(message);
        System.out.println("Notification added: " + message);
    }

    public void viewNotifications() {
        System.out.println("Notifications for " + getName() + ":");
        for (String notification : notifications) {
            System.out.println(notification);
        }
    }
}