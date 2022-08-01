import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
//        Perimeter Of Rhombus 2(l+b)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter diagonal one of the Rhombus: ");
        int d1 = in.nextInt();
        System.out.print("Enter diagonal two of the Rhombus: ");
        int d2 = in.nextInt();
        double perimeter = 2 * (d1 * d2);
        System.out.println("The perimeter of Rhombus is " + perimeter);
    }
}
