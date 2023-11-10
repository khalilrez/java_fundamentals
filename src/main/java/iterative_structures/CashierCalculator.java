package iterative_structures;

import java.util.Scanner;

public class CashierCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;
        for (int i=1; i<=quantity;i++){
            System.out.println("Price of item n°"+i);
            double price = scanner.nextDouble();
            total += price;
        }
        scanner.close();
        System.out.println("Total price of "+quantity+" items is: " +total);
    }
}
