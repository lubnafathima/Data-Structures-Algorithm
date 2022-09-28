import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        To find Armstrong Number between two given number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = in.nextInt();
        for(int i=n1;i<n2;i++) {
            int temp = i;
            int sum = 0;
            while(temp > 0) {
                int r = temp % 10;
                sum += (r*r*r);
                temp /= 10;
            }
            if(sum==i) {
                System.out.println(sum);
            }
        }
    }
}
