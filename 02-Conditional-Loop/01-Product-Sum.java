import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        int sum = 0, product = 1, num;
        while (n>0) {
            num = n % 10;
            sum += num;
            product *= num;
            n /= 10;
        }
        int solution = product - sum;
        System.out.println(sum + " ");
        System.out.println(product + " ");
        System.out.println("The solution is "+solution);
    }
}
