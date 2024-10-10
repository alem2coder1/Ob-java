package com.mycompany.app;

public class Main {
    public static void main(String[] args) {
        Iset user1 = new Iset(1, "adam@gmail.com", "12345678", "hello", "World");
        System.out.println(user1.getData());
        Iset student = new Iset(1,"student@gmail.com","4534243","studebnt");
        System.out.println(student.getData());
        Iset admin1 = new OverrideUser(2, "admin@example.com", "12345876", "Alem", "Kaken", "SuperAdmin");
        System.out.println(admin1.getData());
        Iset user3 = new Iset();
        user3.setName("atspai");
        System.out.println(user3.getName());
    }
}