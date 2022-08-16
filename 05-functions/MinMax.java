import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int init = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            n = in.nextInt();
            if (n > init) {
                init = n;
            }
        }
        System.out.println(init + " is the greatest number");
    }
}