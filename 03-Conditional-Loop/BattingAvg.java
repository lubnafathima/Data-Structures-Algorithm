import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
//Calculate Batting Average
        Scanner in = new Scanner(System.in);
        System.out.print("Enter runs, matches and not-out: ");
        int runs = in.nextInt();
        int matches = in.nextInt();
        int notOut = in.nextInt();
        System.out.print(runs / (matches - notOut));
    }
}
