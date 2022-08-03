import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        //-------------------------------
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float P = in.nextFloat();
        System.out.print("Enter Time: ");
        float t = in.nextFloat();
        System.out.print("Enter Rate: ");
        float r = in.nextFloat();
        float si = P * (1 + r * t);
        System.out.println("The Simple interest is " + si);
    }
}
