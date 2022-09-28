import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1+" "+n2);
        for(int i=0;i<n-2;i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
        }
    }
}
