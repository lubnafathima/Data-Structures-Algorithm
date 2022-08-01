import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
//        Perimeter Of Square(4a)
        Scanner side = new Scanner(System.in);
        System.out.print("Enter the side of a Square: ");
        int a = side.nextInt();
        double perimeter = 4 * a;
        System.out.println("Perimeter of Square is " +perimeter);
    }
}
