package com.example.project.boss;

public class User {
    private String id;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String phoneNumber;
    private String gender;
    private FamilyStatus familyStatus;
    private Role role;

    public User(String id, String email, String password, String name, String surname, String phoneNumber,
                String gender, FamilyStatus familyStatus, Role role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.familyStatus = familyStatus;
        this.role = role;
    }

    public void signin() {
        System.out.println(name + " signed in with email: " + email);
    }
    public String getFullName(){
        return name + " " + surname;
    }

    public void logOut() {
        System.out.println(name + " logged out");
    }

    public void signup() {
        System.out.println(name + " signed up with email: " + email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(FamilyStatus familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}