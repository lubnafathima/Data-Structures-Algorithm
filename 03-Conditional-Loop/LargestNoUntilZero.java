import java.util.Scanner;

public class LargestNoUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, num=0;
        while ((n = in.nextInt()) != 0) {
            if (n > num) {
                num = n;
            }
        }
        System.out.println(num);
    }
}
