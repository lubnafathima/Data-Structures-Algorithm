import java.util.Scanner;

public class INRUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter INR: ");
        int INR = in.nextInt();
        int USD = (int) (INR * 0.012);
        System.out.println("INR "+INR+" is "+USD+" USD");
    }
}
