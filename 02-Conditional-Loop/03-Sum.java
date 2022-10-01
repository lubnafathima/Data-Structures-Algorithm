import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the sum of all numbers
        Scanner in = new Scanner(System.in);
        int temp=0;
        System.out.print("Enter a number or enter 0 to quit: ");
        while (true) {
            int n = in.nextInt();
            if(n != 0) {
                temp += n;
            } else {
                System.out.print("Sum = "+temp);
                break;
            }
        }
    }
}
