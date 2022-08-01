import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
//        Volume Of Pyramid lwh/3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Pyramid: ");
        int l = in.nextInt();
        System.out.print("Enter the width of the Pyramid: ");
        int w = in.nextInt();
        System.out.print("Enter the height of the Pyramid: ");
        int h = in.nextInt();
        double volume = (l * w * h)/3;
        System.out.println("The Volume of Pyramid is " + volume);

    }
}
