import java.util.Scanner;

public class DbtwPts {
    public static void main(String[] args) {
//        Distance Between Two Points
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the x1, y1 of point A and x2, y2 of point B: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int dist = (int)Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
        System.out.println("Distance between two points is " + dist);
    }
}
