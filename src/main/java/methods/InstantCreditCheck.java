package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    //default protected variables
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double salary = getSalary();
        // Local Variable Type inference
        var creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary,creditScore);
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(double salary,int creditScore){
        return creditScore >= requiredCreditScore && salary >= requiredSalary;
    }
    public static void notifyUser(boolean qualified){
        if (qualified) System.out.println("You've been approved");
        else System.out.println("You've been declined");
    }
}
