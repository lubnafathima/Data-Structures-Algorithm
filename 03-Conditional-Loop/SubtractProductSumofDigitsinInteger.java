import java.util.Scanner;

public class SubtractProductSumofDigitsinInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0, mul = 1, digit, result;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            mul *= digit;
            num /= 10;
        }
        result = mul - sum;
//        System.out.println(sum + " ");
//        System.out.println(mul + " ");
        System.out.println(result + " ");
    }
}
