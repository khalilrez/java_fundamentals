package decision_structures;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // If an employee gets more than 10 sales , he gets a 200 bonus on his initial 1000 salary
        double salary  = 1000;
        double bonus = 200;
        int quota = 10;

        System.out.println("How many sales did the employee get this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales>quota){
            salary += bonus;
        }
        System.out.println("Salary: "+salary);
    }
}
