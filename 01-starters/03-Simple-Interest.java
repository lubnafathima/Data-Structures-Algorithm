import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
//        Get principle, rate and time from user. Then find Simple Interest using these input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal value: ");
        float principal = in.nextFloat();
        System.out.print("Enter time duration: ");
        float time = in.nextFloat();
        System.out.print("Enter the rate value: ");
        float rate = in.nextFloat();
        float si = principal * (1 + (rate * time));
        System.out.println(" The simple interest is "+si);
    }
}
