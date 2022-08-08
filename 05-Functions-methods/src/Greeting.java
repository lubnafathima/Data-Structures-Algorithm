import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greeting();
    }
    static void greeting() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.next();
        System.out.println("Hello " + name);
    }
}
