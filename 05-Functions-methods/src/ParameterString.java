import java.util.Scanner;

public class ParameterString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inp = in.next();
        String msg = greet(inp);
        System.out.println(msg);
    }

    static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
