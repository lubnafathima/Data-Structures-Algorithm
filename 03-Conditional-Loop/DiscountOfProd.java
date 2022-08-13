import java.util.Scanner;

public class DiscountOfProd {
    public static void main(String[] args) {
//        Calculate Discount Of Product
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        int prod = in.nextInt();
        int discount;
        if (prod < 500) {
            discount = prod * 5/100;
        } else {
            discount = prod * 10/100;
        }
        System.out.println("The product with get discount of Rs:" + discount);
    }
}
//if the product is < 500 then discount = 5%
//if the product is > 500 then discount = 10%