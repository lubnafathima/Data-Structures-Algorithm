import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
//        Area Of Rhombus
        Scanner in = new Scanner(System.in);
        System.out.print("Enter diagonal one of the Rhombus: ");
        int d1 = in.nextInt();
        System.out.print("Enter diagonal two of the Rhombus: ");
        int d2 = in.nextInt();
        double area = 0.5 * d1 * d2;
        System.out.println("The Area of Rhombus is " + area);
    }
}
