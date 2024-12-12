package com.example.project.boss;


import java.util.*;

public class UserController {
    protected List<User> userList = new ArrayList<>();
    protected Map<String, User> userMap = new HashMap<>();

    // 添加用户到列表和映射
    public void addUser(User user) {
        userList.add(user);
        userMap.put(user.getId(), user);
        System.out.println("Added user: " + user.getFullName());
    }

    // 删除用户
    public void removeUserById(String id) {
        User removedUser = userMap.remove(id);
        if (removedUser != null) {
            userList.remove(removedUser);
            System.out.println("Removed user: " + removedUser.getFullName());
        } else {
            System.out.println("User not found with ID: " + id);
        }
    }

    // 查找用户
    public User findUserById(String id) {
        return userMap.get(id);
    }

    // 显示所有用户
    public void displayAllUsers() {
        System.out.println("All Users:");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    // 按名字排序用户列表
    public void sortUsersByName() {
        userList.sort(Comparator.comparing(User::getName));
        System.out.println("Users sorted by name.");
    }

    // 按姓氏排序用户列表
    public void sortUsersBySurname() {
        userList.sort(Comparator.comparing(User::getSurname));
        System.out.println("Users sorted by surname.");
    }

    // 批量导入用户
    public void importUsers(List<User> users) {
        for (User user : users) {
            addUser(user);
        }
    }

    // 使用 Scanner 添加用户
    public void addUserFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Family Status (MARRIED/NOT_MARRIED): ");
        FamilyStatus familyStatus = FamilyStatus.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter Role (TEACHER/STUDENT/MANAGER): ");
        Role role = Role.valueOf(scanner.nextLine().toUpperCase());

        User newUser = new User(id, email, password, name, surname, phoneNumber, gender, familyStatus, role);
        addUser(newUser);

        System.out.println("User added from input: " + newUser.getFullName());
    }
}