import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        int one, two, sum;
        System.out.print("Enter First Number: ");
        one = in.nextInt();
        System.out.print("Enter Second Number: ");
        two = in.nextInt();
        sum = one + two;
        System.out.println("The sum of " + one + " and " + two + " is " + sum);
    }
}
