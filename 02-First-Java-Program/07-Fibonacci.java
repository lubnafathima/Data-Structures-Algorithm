import java.util.Scanner;

public Fibonacci {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        //-------------------------------
        System.out.print("Enter a number: ");
        Scanner numIp = new Scanner(System.in);
        int count = numIp.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print("The Fibonacci Series up to " + count + " counts are ");
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i + 2 < count; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}