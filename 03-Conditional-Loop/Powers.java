import java.util.Scanner;
import java.lang.Math;

public class Powers {
    public static void main(String[] args) {
//        Powers in Java
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        double b = in.nextInt();
        System.out.print("Enter exponent: ");
        double e = in.nextInt();
        System.out.println(Math.pow(b, e));
    }
}
