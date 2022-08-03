import java.util.Scanner;

public LargestNo {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        //-------------------------------
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Input: ");
        int one = in.nextInt();
        System.out.print("Enter Second Input: ");
        int two = in.nextInt();
        if (one > two) {
            System.out.println(one + " is greater than " + two);
        } else {
            System.out.println(two + "is greater than " + one);
        }
    }
}
