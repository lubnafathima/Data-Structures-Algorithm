import java.util.Scanner;

public class SumofNno {
    public static void main(String[] args) {
//        Sum Of N Numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total count of numbers: ");
        int n = in.nextInt();
        int count = 1, total = 0;
        while (count <= n) {
            System.out.print("Enter number " + count + ": ");
            int num = in.nextInt();
            total += num;
            count++;
        }
        System.out.println(total);

    }
}
