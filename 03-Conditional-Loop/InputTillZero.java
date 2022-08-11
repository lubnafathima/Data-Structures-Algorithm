import java.util.Scanner;

public class InputTillZero {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num ;
        int sum = 0;
        while ((num = in.nextInt()) != 0) {
            sum += num;
        }
        System.out.print(sum + " ");
    }
}
