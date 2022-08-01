import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
//        Total Surface Area Of Cube 6aa
        Scanner side = new Scanner(System.in);
        System.out.print("Enter the side of a Cube: ");
        int a = side.nextInt();
        double totalSurfaceArea = 6 * a * a;
        System.out.println("total Surface Area of Cube is " +totalSurfaceArea);
    }
}