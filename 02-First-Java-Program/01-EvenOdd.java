import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        // L: gave myself a challenge to print first 10 statement
        //-------------------------------
        System.out.print("Please Enter a number: ");
        Scanner oddEven = new Scanner(System.in);
        int evenOdd = oddEven.nextInt();
        while (evenOdd <= 10) {
            if (evenOdd % 2 == 0) {
                System.out.println("The number " + evenOdd + " is even");
            } else {
                System.out.println("The number " + evenOdd + " is odd");
            }
            evenOdd++;
        }
    }
}