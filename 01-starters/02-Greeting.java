import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        Upgrade: When ever user enters 1, they get a greeting message and 0 to stop
        System.out.println("1. Greeting message");
        System.out.println("0. Stop");
        while(true) {
            System.out.print("Enter (1/0): ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if(n==1) {
                System.out.print("Enter your name: ");
                String str = in.next();
                System.out.println("Hello "+str+"! Have a great day :)");
            } else {
                System.out.println("Thank you :) ");
                break;
            }
        }
    }
}
