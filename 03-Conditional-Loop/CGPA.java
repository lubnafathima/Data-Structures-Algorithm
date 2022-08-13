import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
//        Calculate CGPA Java Program
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        double n = in.nextInt();
        double count = 1, total = 0;
        while (count <= n) {
            System.out.print("Enter your subject mark: ");
            double num = in.nextInt();
            total += num;
            count++;
        }
        double cgpa = total * n / 100;
        System.out.println("The CGPA is " + cgpa);
    }
}
