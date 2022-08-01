import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
//        Curved Surface Area Of Cylinder 2 pi rh
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of a Cylinder: ");
        int r = in.nextInt();
        System.out.print("Enter the height of a cylinder: ");
        int h = in.nextInt();
        double CurvedSurfaceArea = 2 * 3.14 * r * h;
        System.out.println("Perimeter of Square is " + CurvedSurfaceArea);
    }
}