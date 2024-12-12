package com.example.project.UniverService;

import com.example.project.boss.User;
import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
import java.util.HashMap;
import java.util.Map;

public class FeeManagement extends User {
    private Map<String, Double> fees = new HashMap<>();

    public FeeManagement(String id, String email, String password, String name, String surname,
                         String phoneNumber, String gender, FamilyStatus familyStatus, Role role) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
    }

    public void recordFee(String studentId, double amount) {
        fees.put(studentId, fees.getOrDefault(studentId, 0.0) + amount);
        System.out.println("Fee recorded for student " + studentId + ": " + amount);
    }

    public void payFee(String studentId, double amount) {
        if (fees.containsKey(studentId) && fees.get(studentId) >= amount) {
            fees.put(studentId, fees.get(studentId) - amount);
            System.out.println("Fee paid by student " + studentId + ": " + amount);
        } else {
            System.out.println("Invalid fee payment for student: " + studentId);
        }
    }

    public void viewFeeStatus(String studentId) {
        System.out.println("Fee balance for " + studentId + ": " + fees.getOrDefault(studentId, 0.0));
    }
}