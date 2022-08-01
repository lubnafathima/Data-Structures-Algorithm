import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
//        Perimeter Of Rectangle 2(l+w)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle: ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of the Rectangle: ");
        int b = in.nextInt();
        double perimeter = 2 * (l * b);
        System.out.println("The perimeter of Rectangle is " + perimeter);
    }
}
