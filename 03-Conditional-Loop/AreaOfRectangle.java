import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
//        Area Of Rectangle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle: ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of the Rectangle: ");
        int b = in.nextInt();
        double area = l * b;
        System.out.println("The Area of Rectangle is " + area);
    }
}
