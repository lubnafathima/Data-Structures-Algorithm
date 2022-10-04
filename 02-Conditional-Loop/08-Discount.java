import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of a product: ");
        int n = in.nextInt();
        if(n > 2000) {
            int discount = n * 10 / 100;
            System.out.println("The Discount for Rs: "+n+" is "+discount);
        } else {
            System.out.println("No Discount available of Rs: "+n);
        }
    }
}
