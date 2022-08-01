import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
//        Perimeter Of Equilateral Triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Equilateral Triangle: ");
        int s = in.nextInt();
        double perimeter = 3 * s;
        System.out.println("The perimeter of Equilateral Triangle is " + perimeter);
    }
}
