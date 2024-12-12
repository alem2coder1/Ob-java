package com.example.project.CourseService;

public class Transcript {
    private int totalCredits;
    private double gpa;
    private String[] marks;

    public Transcript(int totalCredits, double gpa, String[] marks) {
        this.totalCredits = totalCredits;
        this.gpa = gpa;
        this.marks = marks;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getMarks() {
        return marks;
    }

    public void setMarks(String[] marks) {
        this.marks = marks;
    }
}