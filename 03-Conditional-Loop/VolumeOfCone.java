import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
//        Volume Of Cone pi r*r h/3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the Cone: ");
        int r = in.nextInt();
        System.out.print("Enter the height of the Cone: ");
        int h = in.nextInt();
        double volume = (r * r * h)/3;
        System.out.println("The Volume of Cone is " + volume);
    }
}
