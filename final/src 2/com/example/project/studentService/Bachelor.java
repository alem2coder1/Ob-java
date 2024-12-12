package com.example.project.studentService;
import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
public class Bachelor extends Student {

    public Bachelor(String id, String email, String password, String name, String surname, String phoneNumber,
                    String gender, FamilyStatus familyStatus, Role role, Faculty faculty, int year) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role, faculty, year);
    }

    public void protectionOfTheDiploma() {
        System.out.println(getName() + " is preparing for the diploma defense.");
    }
}