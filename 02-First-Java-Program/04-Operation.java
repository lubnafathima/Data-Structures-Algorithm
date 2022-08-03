import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        //-------------------------------
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Operand: ");
        int operandOne = in.nextInt();
        System.out.print("Enter Second Operand: ");
        int operandTwo = in.nextInt();
        System.out.print("Enter the Operator(+, -, *, /): ");
        String operator = in.next();
        int operation;
        if (operator.equals("+")) {
            operation = operandOne + operandTwo;
            System.out.println(operandOne + " + " + operandTwo + " = " + operation);
        } else if (operator.equals("-")) {
            operation = operandOne - operandTwo;
            System.out.println(operandOne + " - " + operandTwo + " = " + operation);
        } else if (operator.equals("*")) {
            operation = operandOne * operandTwo;
            System.out.println(operandOne + " * " + operandTwo + " = " + operation);
        } else if (operator.equals("/")) {
            operation = operandOne / operandTwo;
            System.out.println(operandOne + " / " + operandTwo + " = " + operation);
        } else {
            System.out.println("Enter Correct Operator");
        }
    }
}
