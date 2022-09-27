import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//upgrade: added while loop to do multiple operations
public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operation;
        while(true) {
            System.out.print("Enter 1 to perform operation and 0 to quit: ");
            int n = in.nextInt();
            if(n == 1) {
                System.out.print("Enter first input: ");
                int inp1 = in.nextInt();
                System.out.print("Enter second input: ");
                int inp2 = in.nextInt();
                System.out.print("Enter\n + for addition\n - for subtraction \n * for multiplication \n / for division: ");
                String operator = in.next();
                if(operator.equals("+")) {
                    operation = inp1 + inp2;
                } else if(operator.equals("-")) {
                    operation = inp1 - inp2;
                } else if(operator.equals("*")) {
                    operation = inp1 * inp2;
                } else if(operator.equals("/")) {
                    operation = inp1 / inp2;
                } else {
                    System.out.println("Enter a valid operator");
                    break;
                }
                System.out.println(""+inp1+""+operator+""+inp2+" is "+operation);
            } else {
                System.out.println("Thank you");
                break;
            }
        }
    }
}
