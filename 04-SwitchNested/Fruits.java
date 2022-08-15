import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Doctors friend");
            default -> System.out.println("Enter valid fruit");
        }
    }
}
