import java.util.Scanner;
//Calculate Average Of N Numbers
public class AvgNnos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the count of numbers: ");
        int n = in.nextInt(), count = 1, sum = 0, num;
        float avg;
        while (count <= n) {
            System.out.print("Enter the " + count + " number: ");
            num = in.nextInt();
            sum += num;
            count++;
        }
        avg = sum / n;
        System.out.print("The average of given numbers are " + avg);
    }
}
