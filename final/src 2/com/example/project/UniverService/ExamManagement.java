package com.example.project.UniverService;

import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
import com.example.project.boss.User;

import java.util.HashMap;
import java.util.Map;

public class ExamManagement extends User {
    private Map<String, Map<String, Integer>> examScores = new HashMap<>();

    public ExamManagement(String id, String email, String password, String name, String surname,
                          String phoneNumber, String gender, FamilyStatus familyStatus, Role role) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
    }

    public void recordScore(String studentId, String subject, int score) {
        examScores.putIfAbsent(studentId, new HashMap<>());
        examScores.get(studentId).put(subject, score);
        System.out.println("Score recorded for " + studentId + " in " + subject + ": " + score);
    }

    public void viewScores(String studentId) {
        Map<String, Integer> scores = examScores.get(studentId);
        if (scores != null) {
            System.out.println("Scores for " + studentId + ": " + scores);
        } else {
            System.out.println("No scores available for student: " + studentId);
        }
    }
}