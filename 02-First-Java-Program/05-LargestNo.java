import java.util.Scanner;

public LargestNo {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        //-------------------------------
        System.out.print("Enter First Input: ");
        Scanner oneIp = new Scanner(System.in);
        int one = oneIp.nextInt();
        System.out.print("Enter Second Input: ");
        Scanner twoIp = new Scanner(System.in);
        int two = twoIp.nextInt();
        if (one > two) {
            System.out.println(one + " is greater than " + two);
        } else {
            System.out.println(two + "is greater than " + one);
        }
    }
}