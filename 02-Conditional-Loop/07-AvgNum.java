import java.util.Scanner;

public class AvgNum {
    public static void main(String[] args) {
//        Calculate Average Of N Numbers
        Scanner in = new Scanner(System.in);
        int temp=0, count=1, sol;
        System.out.print("Enter your numbers or 0 to exit: ");
        while(true) {
            int n = in.nextInt();
            if(n!=0) {
                temp+=n;
                count++;
            } else {
                sol = temp / (count - 1);
                System.out.println("The average is "+sol);
                break;
            }
        }
    }
}
