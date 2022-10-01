import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner in = new Scanner(System.in);
        int temp=0;
        System.out.print("Enter a number or enter 0 to quit: ");
        while (true) {
            int n = in.nextInt();
            if(n > temp) {
                temp = n;
            } else {
                System.out.print("Largest number = "+temp);
                break;
            }
        }
    }
}
