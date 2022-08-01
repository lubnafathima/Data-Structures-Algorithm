import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
//        Volume Of Cylinder pi r*r h
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the Cylinder: ");
        int r = in.nextInt();
        System.out.print("Enter the height of the Cylinder: ");
        int h = in.nextInt();
        double volume = 3.14 * r * r * h;
        System.out.println("The Volume of Cylinder is " + volume);
    }
}
