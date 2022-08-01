import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
//        Perimeter Of Circle
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = radius.nextInt();
        double perimeter = 2 * 3.14 * r;
        System.out.println("Perimeter of Circle is " +perimeter);

    }
}
