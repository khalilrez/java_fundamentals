package decision_structures;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        // All are expected to make atleast 10 sales each week , if you do you get a congratulatory message , for those
        // who don't they get informed how much sales they were short
        int quota = 10;
        String message = "Congratulations you made sales quota this week";

        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if(sales>=quota){
            System.out.println(message);
        }else {
            int missing = quota - sales;
            System.out.println("Unlucky ! You're short "+missing+" sales this week.");
        }
    }
}
