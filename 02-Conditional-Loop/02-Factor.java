import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
//        Input a number and print all the factors of that number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        for (int i=1; i<n; i++) {
            if(n%i==0) {
                System.out.println(i + " ");
            }
        }
    }
}
