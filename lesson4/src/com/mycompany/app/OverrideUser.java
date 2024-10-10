package com.mycompany.app;
public class OverrideUser extends Iset {
    private String adminRole;
    public OverrideUser(int id, String login, String password, String name, String surname, String adminRole) {
        super(id, login, password, name, surname);
        this.adminRole = adminRole;
    }
    @Override
    public String getData() {
        return super.getData() + "\nRole: Admin (" + adminRole + ")";
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }
}