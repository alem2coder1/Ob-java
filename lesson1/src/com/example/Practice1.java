import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
//        1
        String name = "Alem";
        int length = name.length();
        System.out.println("+" + "-".repeat(length) + "+");
        System.out.printf("|%s|\n", name);
        System.out.println("+" + "-".repeat(length) + "+");

//        2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double a = scanner.nextDouble();
        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = Math.sqrt(2) * a;
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);

//        3
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();
        scanner.nextLine(); // 清除缓冲区中的换行符
        String grade;
        if (score >= 95 && score <= 100) {
            grade = "A";
        } else if (score >= 90 && score < 95) {
            grade = "A-";
        } else if (score >= 85 && score < 90) {
            grade = "B+";
        } else if (score >= 80 && score < 85) {
            grade = "B";
        } else if (score >= 75 && score < 80) {
            grade = "B-";
        } else if (score >= 70 && score < 75) {
            grade = "C+";
        } else if (score >= 65 && score < 70) {
            grade = "C";
        } else if (score >= 60 && score < 65) {
            grade = "C-";
        } else if (score >= 55 && score < 60) {
            grade = "D+";
        } else if (score >= 50 && score < 55) {
            grade = "D";
        } else if (score < 50 && score >= 0) {
            grade = "F";
        } else {
            grade = "Invalid score. Please enter a number between 0 and 100.";
        }

        System.out.println("Your grade is: " + grade);

//        4
        System.out.print("Enter coefficient a: ");
        double coefA = scanner.nextDouble();  // Renamed from `a` to `coefA`

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        double D = b * b - 4 * coefA * c;
        if (D < 0) {
            System.out.println("The equation has no real roots, because the discriminant (D) is negative.");
        } else {
            double sqrtD = Math.sqrt(D);
            double denominator = 2 * coefA;
            double root1 = (-b + sqrtD) / denominator;
            double root2 = (-b - sqrtD) / denominator;
            System.out.println("The roots of the quadratic equation are: ");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
//5
        double initialBalance = 1000.0;
        double annualInterestRate = 5.0;
        double interestEarned = initialBalance * (annualInterestRate / 100);
        double newBalance = initialBalance + interestEarned;
        System.out.println("Initial Balance: $" + initialBalance);
        System.out.println("Interest Rate: " + annualInterestRate + "%");
        System.out.println("Interest Earned: $" + interestEarned);
        System.out.println("New Balance: $" + newBalance);

//        6
        System.out.print("Enter a word to check if it's a palindrome: ");
        scanner.nextLine(); // 清除缓冲区中的换行符
        String testWord = scanner.nextLine();  // 获取用户输入

        if (isPalindrome(testWord)) {
            System.out.println(testWord + " is a palindrome.");
        } else {
            System.out.println(testWord + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        String normalizedInput = input.toLowerCase();
        int left = 0;
        int right = normalizedInput.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(normalizedInput.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(normalizedInput.charAt(right))) {
                right--;
            }
            else {
                if (normalizedInput.charAt(left) != normalizedInput.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}