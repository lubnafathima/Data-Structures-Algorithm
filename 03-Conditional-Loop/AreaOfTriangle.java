import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
//        Area Of Triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the Triangle: ");
        int height = in.nextInt();
        System.out.print("Enter the base of the Triangle: ");
        int base = in.nextInt();
        double area = 0.5 * height * base;
        System.out.println("The Area of Triangle is " + area);
    }
}
