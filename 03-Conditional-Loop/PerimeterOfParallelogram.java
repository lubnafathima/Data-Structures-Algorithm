import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
//        Perimeter Of Parallelogram 2(a+b)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Parallelogram: ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of the Parallelogram: ");
        int b = in.nextInt();
        double perimeter = 2 * (l + b);
        System.out.println("The perimeter of Parallelogram is " + perimeter);
    }
}
