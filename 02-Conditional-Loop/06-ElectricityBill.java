import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Electricity units: ");
        int unit = in.nextInt();
        int bill, count = unit/100;
        if(unit < 100) {
            bill = unit * 10;
        } else if (unit < 200) {
            bill = 100 * 15 + (unit - 100) * 10;
        } else if (unit < 300) {
            bill = 100 * 20 + 100 * 15 + (unit - 200) * 10;
        } else {
            bill = 100 * 25 + 100 * 20 + 100 * 15 + (unit - (count * 100)) * 10;
        }
        System.out.print("The Electricity bill is " + bill);
    }
}
