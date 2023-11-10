package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("WE'RE PREPARING YOUR LOTTERY TICKET");

        // DRAMATIC EFFECT START -------------
        TimeUnit.SECONDS.sleep(1);
        System.out.println(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);
        // --------- DRAMATIC EFFECT END

        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    private static void printTicket(int[] ticket) {
        Arrays.sort(ticket);
        System.out.print(ticket[0]+"-");
        for (int i=1;i<LENGTH-1;i++){
            System.out.print("-"+ticket[i]+"-");
        }
        System.out.println("-"+ticket[LENGTH-1]);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i=0; i<LENGTH; i++){
            int randomNumber;
            do {
                randomNumber = random.nextInt(1,MAX_TICKET_NUMBER);
            }while (search(ticket,randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    private static boolean search(int[] ticket, int randomNumber) {
        for(int x : ticket){
            if(x == randomNumber) return true;
        }
        return false;
    }
}
