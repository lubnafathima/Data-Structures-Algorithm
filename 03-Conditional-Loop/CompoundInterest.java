import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest {
    public static void main(String[] args) {
//        Compound Interest Java Program
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principle: ");
        double p = in.nextInt();
        System.out.print("Enter rate: ");
        double r = in.nextInt();
        System.out.print("Enter timespan: ");
        double t = in.nextInt();
        System.out.print(p * Math.pow((1 - r / 100), t));
    }
}
