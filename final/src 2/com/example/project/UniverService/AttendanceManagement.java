package com.example.project.UniverService;

import com.example.project.boss.User;
import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
import java.util.HashMap;
import java.util.Map;

public class AttendanceManagement extends User {
    private Map<String, Integer> attendance = new HashMap<>();

    public AttendanceManagement(String id, String email, String password, String name, String surname,
                                String phoneNumber, String gender, FamilyStatus familyStatus, Role role) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
    }

    public void markAttendance(String studentId) {
        attendance.put(studentId, attendance.getOrDefault(studentId, 0) + 1);
        System.out.println("Attendance marked for student: " + studentId);
    }

    public void viewAttendance(String studentId) {
        System.out.println("Attendance for " + studentId + ": " + attendance.getOrDefault(studentId, 0) + " days");
    }
}