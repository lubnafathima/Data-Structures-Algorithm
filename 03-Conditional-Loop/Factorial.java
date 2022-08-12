import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        Factorial Program In Java
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int fact=0;
        for (int i = n; i > 0; i--) {
            fact+=i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
