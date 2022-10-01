import java.util.Scanner;

public class Add2Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter 1 to add two numbers or enter 0 to quit: ");
            int n = in.nextInt();
            if(n==1) {
                System.out.print("Enter two numbers: ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                int sum = n1 + n2;
                System.out.println(n1+" + "+n2+" = "+sum);
            } else {
                System.out.println("Thank You!");
                break;
            }
        }
    }
}
