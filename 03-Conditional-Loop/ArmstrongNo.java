import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
//        Armstrong Number In Java
        Scanner in = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = in.nextInt();
        System.out.print("Enter ending number: ");
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n /10;
            }
            if (sum == i) {
                System.out.print(sum + " ");
            }
        }
    }
}