package decision_structures;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();
        char grade = 0;

        if(score<60){
            grade = 'F';
        } else if (score<70) {
            grade = 'D';
        } else if (score<80) {
            grade = 'C';
        } else if (score<90) {
            grade = 'B';
        }else {
            score = 'A';
        }
        System.out.println("You got a "+grade+".");
    }
}
