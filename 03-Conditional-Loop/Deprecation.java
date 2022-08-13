import java.util.Scanner;
import java.lang.Math;

public class Deprecation {
    public static void main(String[] args) {
//        Calculate Depreciation of Value
//        v * (1 - r / 100)^t
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        double v = in.nextInt();
        System.out.print("Enter the Rate of Deprecation: ");
        double r = in.nextInt();
        System.out.print("Enter the Time in years: ");
        double t = in.nextInt();
        System.out.print(v * Math.pow((1 - r / 100), t));
    }
}
