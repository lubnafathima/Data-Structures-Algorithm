import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int week = in.nextInt();
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
