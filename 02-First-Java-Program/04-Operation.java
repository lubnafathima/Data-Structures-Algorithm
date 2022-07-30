import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        //-------------------------------
        System.out.print("Enter First Operand: ");
        Scanner operandOneIp = new Scanner(System.in);
        int operandOne = operandOneIp.nextInt();
        System.out.print("Enter Second Operand: ");
        Scanner operandTwoIp = new Scanner(System.in);
        int operandTwo = operandTwoIp.nextInt();
        System.out.print("Enter the Operator(+, -, *, /): ");
        Scanner operatorIp = new Scanner(System.in);
        String operator = operatorIp.next();
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