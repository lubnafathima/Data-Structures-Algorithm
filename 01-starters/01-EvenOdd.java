import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
//        Upgrade: This program checks if the number is even or odd, from 1 to the input given by the user
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=1; i<=n; i++) {
            if(i % 2 == 0) {
                System.out.println(i+" is a even number");
            } else {
                System.out.println(i+" is an odd number");
            }
        }
    }
}
