package com.example.project.ResearcherService;

import com.example.project.boss.User;
import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;

public class Researcher extends User {
    private String fieldOfStudy;

    public Researcher(String id, String email, String password, String name, String surname, String phoneNumber,
                      String gender, FamilyStatus familyStatus, Role role, String fieldOfStudy) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void publishResearch() {
        System.out.println(getName() + " has published research in " + fieldOfStudy);
    }

    public void deleteResearch() {
        System.out.println(getName() + " has deleted research in " + fieldOfStudy);
    }
}