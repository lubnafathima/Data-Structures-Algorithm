import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
//        Volume Of Prism bh
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the Prism: ");
        int b = in.nextInt();
        System.out.print("Enter the height of the Prism: ");
        int h = in.nextInt();
        double volume = b * h;
        System.out.println("The Volume of Prism is " + volume);
    }
}
