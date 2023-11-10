package iterative_structures;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        double rate = 15;
        double maxHours = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked>maxHours || hoursWorked<0){
            System.out.println("Invalid, Max hours is 40 (you can't input negative hours)");
            scanner = new Scanner(System.in);
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        System.out.println("Gross Pay: "+hoursWorked*rate);
    }
}
