import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        //-------------------------------
        System.out.print("Please Enter your name: ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        System.out.println("Hola " + name + ", Have a great day!!!");
    }
}