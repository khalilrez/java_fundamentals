package decision_structures;

import java.util.Scanner;

public class GradeMessageSwitchExpression {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message = switch (grade.toUpperCase()) {
            case "A" -> {
                String multipleStatements = "Made this to show how to put multiple statements in expression";
                yield "Excellent !";
            }
            case "B" -> "Very Good !";
            case "C" ->  "Not Bad !";
            case "D" -> "You Can Do Better !";
            case "F" -> "Sorry You Failed :( ";
            default -> "Error. \n That's an invalid grade. Maybe retry inputting your grade ?";
        };

        System.out.println(message);
    }
}
