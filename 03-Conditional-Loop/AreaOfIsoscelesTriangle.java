import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
//        Area Of Isosceles Triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the Isosceles Triangle: ");
        int height = in.nextInt();
        System.out.print("Enter the base of the Isosceles Triangle: ");
        int base = in.nextInt();
        double area = 0.5 * height * base;
        System.out.println("The Area of Isosceles Triangle is " + area);
    }
}
