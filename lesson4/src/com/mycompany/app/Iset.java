package com.mycompany.app;

public class Iset {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;
    public Iset() {}

    public Iset(int id, String login, String password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public Iset(int id, String login, String password, String name) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = "Әкеңнің аты кім?";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getData() {
        return "ID: " + id + "\nLogin: " + login + "\nPassword: " + password +
                "\nName: " + name + "\nSurname: " + surname;
    }
}