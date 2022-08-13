import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
//        Calculate Average Marks
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        double n = in.nextInt();
        double count = 1, total = 0;
        while (count <= n) {
            System.out.print("Enter subject mark: ");
            double num = in.nextInt();
            total += num;
            count++;
        }
        int avg = (int) (total * (n / 10));
        System.out.println(avg);
    }
}
