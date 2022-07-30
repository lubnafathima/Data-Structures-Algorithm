import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        //-------------------------------
        System.out.print("Enter Principal: ");
        Scanner principal = new Scanner(System.in);
        float P = principal.nextFloat();
        System.out.print("Enter Time: ");
        Scanner time = new Scanner(System.in);
        float t = time.nextFloat();
        System.out.print("Enter Rate: ");
        Scanner rate = new Scanner(System.in);
        float r = rate.nextFloat();
        float si = P * (1 + r * t);
        System.out.println("The Simple interest is " + si);
    }
}