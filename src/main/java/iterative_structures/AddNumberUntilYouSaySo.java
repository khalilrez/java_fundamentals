package iterative_structures;

import java.util.Scanner;

public class AddNumberUntilYouSaySo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start inputting numbers to sum (Minimum of 2).");
        int sum = scanner.nextInt();

        String exitMessage;
        do {
            System.out.println("Next number : ");
            int nextNumber = scanner.nextInt();
            sum += nextNumber;
            System.out.println("Are you done? ('q' to exit, anything else to continue)");
            exitMessage = scanner.next();
        } while (!exitMessage.equals("q"));

        System.out.println("Sum is :" + sum);
    }
}
