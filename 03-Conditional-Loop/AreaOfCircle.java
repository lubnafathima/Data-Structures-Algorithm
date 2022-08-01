import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
//        Area Of Circle Java Program
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = radius.nextInt();
        double Area = 3.14 * r * r;
        System.out.println(Area);
    }
}
