package com.example.project.UniverService;

import com.example.project.boss.FamilyStatus;
import com.example.project.boss.Role;
import com.example.project.boss.User;

import java.util.HashMap;
import java.util.Map;

public class LibraryManagement extends User {
    private Map<String, Integer> books = new HashMap<>();

    public LibraryManagement(String id, String email, String password, String name, String surname,
                             String phoneNumber, String gender, FamilyStatus familyStatus, Role role) {
        super(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
    }

    public void addBook(String bookName, int quantity) {
        books.put(bookName, books.getOrDefault(bookName, 0) + quantity);
        System.out.println("Book added: " + bookName + " (Quantity: " + quantity + ")");
    }

    public void borrowBook(String bookName) {
        if (books.containsKey(bookName) && books.get(bookName) > 0) {
            books.put(bookName, books.get(bookName) - 1);
            System.out.println("Book borrowed: " + bookName);
        } else {
            System.out.println("Book not available: " + bookName);
        }
    }

    public void returnBook(String bookName) {
        books.put(bookName, books.getOrDefault(bookName, 0) + 1);
        System.out.println("Book returned: " + bookName);
    }
}