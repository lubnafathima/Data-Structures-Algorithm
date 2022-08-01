import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
//        Area Of Parallelogram
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Parallelogram: ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of the Parallelogram: ");
        int b = in.nextInt();
        double area = l * b;
        System.out.println("The Area of Parallelogram is " + area);
    }
}
