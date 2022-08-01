import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
//        Area Of Equilateral Triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Equilateral Triangle: ");
        int s = in.nextInt();
        double area = 3 * s;
        System.out.println("The Area of Equilateral Triangle is " + area);
    }
}
