package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message = "";

        switch (grade.toUpperCase()) {
            case "A":
                message = "Excellent !";
                break;
            case "B":
                message = "Very Good !";
                break;
            case "C":
                message = "Not Bad !";
                break;
            case "D":
                message = "You Can Do Better !";
                break;
            case "F":
                message = "Sorry You Failed :( ";
                break;
            default:
                message = "That's an invalid grade. Maybe retry inputting your grade ?";
                break;
        }

        System.out.println(message);
    }
}
