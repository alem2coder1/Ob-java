package com.example.project.EmployeeService;

public class Message {
    private String theme;
    private String text;
    private String sender;
    private boolean isRead;

    public Message(String theme, String text, String sender) {
        this.theme = theme;
        this.text = text;
        this.sender = sender;
        this.isRead = false;
    }

    public String getTheme() {
        return theme;
    }

    public String getText() {
        return text;
    }

    public String getSender() {
        return sender;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}