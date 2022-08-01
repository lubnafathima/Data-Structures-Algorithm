import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
//        Volume Of Sphere 4/3 pi r*r*r
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the Sphere: ");
        int r = in.nextInt();
        double volume = (4 * 3.14 * r * r * r)/3;
        System.out.println("The Volume of Sphere is " + volume);
    }
}
