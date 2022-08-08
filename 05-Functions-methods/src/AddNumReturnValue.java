import java.util.Scanner;

public class AddNumReturnValue {
    public static void main(String[] args) {
        int answer = sum();
        System.out.print("The sum is " + answer);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("1st Number: ");
        int one = in.nextInt();
        System.out.print("2nd Number: ");
        int two = in.nextInt();
        int add = one + two;
        return add;
    }
}
