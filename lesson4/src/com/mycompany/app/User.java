package com.mycompany.app;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User: " + name;
    }
}

class Student extends User {
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

class Staff extends User {
    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}
public class UserManagementSystem {
    private static List<User> users = new ArrayList<>();  // List to store all users

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addUser(scanner);
                    break;
                case 2:
                    listUsers(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addUser(Scanner scanner) {
        System.out.println("PRESS [1] TO ADD STUDENT");
        System.out.println("PRESS [2] TO ADD STAFF");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        if (choice == 1) {
            users.add(new Student(name));
            System.out.println("Student added.");
        } else if (choice == 2) {
            users.add(new Staff(name));
            System.out.println("Staff added.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void listUsers(Scanner scanner) {
        System.out.println("PRESS [1] TO LIST STUDENTS");
        System.out.println("PRESS [2] TO LIST STAFF");

        int choice = scanner.nextInt();

        if (choice == 1) {
            listStudents();
        } else if (choice == 2) {
            listStaff();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void listStudents() {
        System.out.println("Listing all students:");
        for (User user : users) {
            if (user instanceof Student) {
                System.out.println(user);
            }
        }
    }

    private static void listStaff() {
        System.out.println("Listing all staff:");
        for (User user : users) {
            if (user instanceof Staff) {
                System.out.println(user);
            }
        }
    }
}