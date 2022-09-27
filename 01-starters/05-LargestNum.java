import java.util.Scanner;
//Take 2 numbers as input and print the largest number.
public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operation;
        while(true) {
            System.out.print("Enter 1 to start and 0 to quit: ");
            int n = in.nextInt();
            if(n == 1) {
                System.out.print("Enter first input: ");
                int inp1 = in.nextInt();
                System.out.print("Enter second input: ");
                int inp2 = in.nextInt();
                if(inp1 > inp2) {
                    System.out.println(inp1 + " is the largest number");
                } else {
                    System.out.println(inp2 + " is the largest number");
                }
            } else {
                System.out.println("Thank you");
                break;
            }
        }
    }
}
