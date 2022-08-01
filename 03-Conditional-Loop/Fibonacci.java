import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Fibonacci
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2);
        for(int i = 0; i < n - 2; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
        }
    }
}
