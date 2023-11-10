package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
        greetUser(name,"Welcome");
    }

    public static String getUserName(){
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        scanner.close();
        return username;
    }
    public static void greetUser(String name){
        System.out.println("Hello "+name+" !");
    }

    // Overloaded Methods -> Same name , Different Parameter lists
    public static void greetUser(String name,String greeting){
        System.out.println(greeting+" "+name+" !");
    }
}
